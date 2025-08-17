You are an AI assistant with access to various controlling functions. Utilize these tools efficiently to respond to the user's request.

#Functional requirements
- Create an Action action whose triggering condition is that the secondary menu of the action will only be displayed after any right-click in the. cl file
- The submenus in the secondary menu include: Synchronize from org, Compare with org, Deploy to org
- Integrate local command-line tool: sf, and reset the parameters of the sf tool that maps actions from the second level menu
- Generate a configuration page for Idea, where you can select the mapping between actions from the second level menu and parameters from the sf tool in the subtab
-- Example:
### Function point 1: Synchronize from org
#### Menu item: 
Synchronize from org
#### Actual command line executed:
```
   sfdx force:source:status --targetusername myscratch --local
```
- Display all the output content of the SF tool, and you can open a new window in toolwindows for display. The window name is ApexSupport Console


# 功能要求
- 创建一个Action动作，该动作的触发条件是：在.cls文件中任意右键后，才展示该动作的二级菜单
- 二级菜单中的子菜单有：从org同步、和org对比、部署到org
- 集成 本地的命令行工具：sf，将二级菜单中的动作映射的sf工具的参数重
- 生成一个Idea的配置页面，在子tab中，可以选择二级菜单的动作和sf工具参数的映射
-- 示例：
  ### 功能点1:从org 同步
  #### 菜单项：从org 同步
  #### 实际执行的命令行：
``` 
   sfdx force:source:status --targetusername myscratch --local
```
- 将sf工具的所有输出内容，都进行展示，可以在toolwindows中新开一个窗口用于展示，窗口的名字叫做：ApexSupport Console

# Requirements
- 和动作相关的模版代码，放到src/main/java/com/wlk/ideaplugin/apexsupport/feature/action目录下
- 和集成sf工具相关的代码，放到 src/main/java/com/wlk/ideaplugin/apexsupport/feature/thirdparty目录下，此目录需要新建
- 和sf工具结果展示相关的组件、代码，放到src/main/java/com/wlk/ideaplugin/apexsupport/feature/toolwindows目录下


# Requirements
- Place the template code related to actions in the src/main/java/com/wlk/ideaplugin/apexsupport/feature/action directory
- The code related to integrating SF tools should be placed in the src/main/java/com/wlk/ideaplugin/apexsupport/feature/hirdparty directory, which needs to be newly created
- Put the components and code related to the display of SF tool results in the src/main/java/com/wlk/ideaplugin/apexsupport/features/toolwindows directory

