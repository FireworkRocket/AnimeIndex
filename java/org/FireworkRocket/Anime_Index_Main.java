/*
 Copyright [2023] [FireworkRocket@126.com]

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package org.FireworkRocket;

import org.FireworkRocket.Anime_Index_Data_Manager.Download_Manager;
import org.FireworkRocket.Anime_Index_Setting.DefAPI;
import org.FireworkRocket.Anime_Index_Setting.DefSet;

import java.io.*;
import java.lang.reflect.Field;

/*
 *阿帕奇库用法
 *  String S[] = {"Hello","World"};
 *  System.out.println(StringUtils.join(S, ','));
 *  输出：HelloWorld
 */

/*
 *下载管理器使用类格式
 *  Download_Manager.filePath =  ""; <- 下载文件链接
 *  Download_Manager.savePath =  ""; <- 保存地址
 *  Download_Manager.downLoadByUrl(Download_Manager.filePath,Download_Manager.savePath); <- 应用下载任务
 */

public class Anime_Index_Main {
//获取图片
    public static void GetPic() {
        // 获取当前类的Class对象
        Class<?> clazz = DefSet.class;
        // 获取当前类的所有成员变量
        Field[] fields = clazz.getDeclaredFields();
        // 遍历成员变量数组并输出
        for (Field field : fields) {
            System.out.println(field.getType());
        }
        Download_Manager.filePath = DefAPI.DmoeAPI;
        Download_Manager.filePath = DefAPI.AaYaoAPI;
        Download_Manager.savePath = "//Temp//JsonTemp//";
        Download_Manager.downLoadByUrl(Download_Manager.filePath,Download_Manager.savePath);
    }
//下载选择的图片
    public static void StartDwnPic() {

    }
//设置背景图片
    public static void SetSysPic() {

    }

}
