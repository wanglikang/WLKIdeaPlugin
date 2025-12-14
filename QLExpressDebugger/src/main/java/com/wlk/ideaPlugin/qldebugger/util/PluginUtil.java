package com.wlk.ideaPlugin.qldebugger.util;

import com.intellij.notification.NotificationGroupManager;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.project.Project;

/**
 * @author 王利康
 * @date 2024/1/7 16:09:57
 */
public class PluginUtil {

    private static String NOTIFICATION_GROUP_NAME = "qlNotify";

    public static void notificationMsg(Project project,String title, String msg){
        NotificationGroupManager.getInstance().getNotificationGroup(NOTIFICATION_GROUP_NAME)
            .createNotification(title, msg == null ? "" : msg, NotificationType.INFORMATION)
            .notify(project);
    }

    public static void notificationErrorMsg(Project project,String title, String msg){
        NotificationGroupManager.getInstance().getNotificationGroup(NOTIFICATION_GROUP_NAME)
            .createNotification(title, msg == null ? "" : msg, NotificationType.ERROR)
            .notify(project);
    }



}
