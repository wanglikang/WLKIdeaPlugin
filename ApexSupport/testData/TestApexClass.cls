/*
* 这是多行注释
* */
@SuppressWarnings('PMD')
public without sharing class AccountManageCommonUtil {
	// 这是单行注释
	private final static String INDIVIDUAL_POOL_NAME = '个人客户公海';
	public static final Map<String, Object> responseMap = new Map<String, Object>();

	  public void tt(){
	          accId2BiddingMap.get(bid.Opportunity__r.AccountId);
	        // String SOQL_STRING = [select Id from User ];
			//String arrayVar = xt[1+2];
			switch on entry.btnType {
					// 认领客户
					when 'claimAccount' {
						entry.needCrossTeam = needCrossTeam;
						if (acc.GreyListedCustomer__c == 'CooperationScope') {
							entry.infoMsg = Label.Claim_Account_Confirm_Msg;
						}
						entry.newOwnerId = UserInfo.getUserId();
					}
					// 释放客户
					when 'returnAccount' {
						//提前校验释放客户的逻辑
						validReleaseAccount(acc);
						entry.newOwnerId = newOwner.Id;
					}
				}
	    }

	public final static Set<String> ALL_PARTNER_RESELLER_SET = new Set<String>{
//		'分销销售', //渠道销售
		'创新孵化'//生态BD岗位
	};
	private static final String ALLOW_PRM_CREATE_OPPTY_ROLE_PATTERN = '^.*(分销销售|生态销售|生态BD).*';

	private final static String SALES_GROUP_SOQL =
		'SELECT Id' +
		', Name' +
		', GeneralGroupMemberCapacity__c' +
		' FROM SalesGroup__c';
	private final static String USER_SOQL = 'SELECT Id, Name, Email, UserRole.Name, Profile.Name, Public_Pool__c FROM User WHERE Name = :{0} AND ISACTIVE = TRUE LIMIT 1';
    private final static String USER_SOQL_BY_TYPE = 'SELECT Id, Name, Email, UserRole.Name, Profile.Name, Public_Pool__c FROM User WHERE ';

    private static final String CHANNEL_FOLLWING_LABLE = '分销销售跟进中';
    public final static Set<String> CLOSE_POOL_RELATE_ACCOUNT_TIER_SET = new Set<String>{
		'General',
		'General - Associated Enterprise',
        'Key Account',
        'Key Account - Associated Enterprise'
	};

    // 判断是否为个人公海
    public static Boolean isIndividualPoolUser(Id userId) {
        return getIndividualPoolUser().Id == userId;
	}

	// 24-9-2 个人客户增加掉落渠道公海
    public static User getSpecifyIndividualPoolUser(Account acc) {
        if (String.isNotBlank(acc.ChannelEcoFollowingLabel__c) &&
            (acc.ChannelEcoFollowingLabel__c.contains(CHANNEL_FOLLWING_LABLE) || acc.ChannelEcoFollowingLabel__c.contains(FEILIAN_FOLLWING_LABLE))) {
            return getChannelFollowingPoolUser();
        }
        return getIndividualPoolUser();
	}



	// 获取用户基本信息
	public static User getUserInfo(Id userId) {
		return [SELECT Id, UserRole.Name, Profile.Name FROM User WHERE Id = :userId];
	}

	// 24-12:25年客户管理规则
	public static Map<Id, Boolean> hasInProgressProject(Set<Id> accIdList) {
		Map<Id, Boolean> hasInProgressProjectMap = new Map<Id, Boolean>();
		Map<Id, Account> accId2AccMap = new Map<Id, Account>([
			SELECT Id,
				(SELECT Id,Status__c FROM Project_Application_Account__r WHERE Status__c = 'Pending'),
				(SELECT Id,Project_Status__c FROM Project_Services__r WHERE Project_Status__c != 'Outflowed')
		 	FROM Account WHERE Id IN :accIdList
		]);
		Map<Id, List<Bidding__c>> accId2BiddingMap = new Map<Id, List<Bidding__c>>();
		for(Bidding__c bid : [
			Select Id, Opportunity__c, Status__c, Bidding_Result__c, Opportunity__r.AccountId, DuplicateProcess__c
			From Bidding__c
			Where Opportunity__r.AccountId IN :accIdList AND DuplicateProcess__c = false
			AND ((Status__c != 'Draft' and Status__c != 'Bidding Process Ended') or (Status__c = 'Bidding Process Ended' AND Bidding_Result__c = 'Win'))
		]) {
			if(!accId2BiddingMap.containsKey(bid.Opportunity__r.AccountId)) {
				accId2BiddingMap.put(bid.Opportunity__r.AccountId, new List<Bidding__c>());
			}
			// accId2BiddingMap.get(bid.Opportunity__r.AccountId);
		}
		return hasInProgressProjectMap;
	}

}