package com.example.daniel.w4d4_homework;

/**
 * Created by Daniel on 11/13/16.
 */

public class Constants {

    public interface ACTION {

        public static String MAIN_ACTION = "com.example.daniel.w4d4_homework.action.foregroundserviceactivity";
        public  static String INIT_ACTION = "com.example.daniel.w4d4_homework.action.init";
        public static String PREV_ACTION = "com.example.daniel.w4d4_homework.action.prev";
        public static String PLAY_ACTION = "com.example.daniel.w4d4_homework.action.play";
        public static String NEXT_ACTION = "com.example.daniel.w4d4_homework.action.next";
        public static String STARTFOREGROUND_ACTION = "com.example.daniel.w4d4_homework.action.startforeground";
        public static String STOPFOREGROUND_ACTION = "com.example.daniel.w4d4_homework.action.stopforeground";
    }

    public interface NOTIFICATION_ID {
        public static int FOREGROUND_SERVICE = 101;
    }
}
