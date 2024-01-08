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

package org.FireworkRocket.Anime_Index_Data_Manager;
import java.io.*;
import java.util.Properties;

public class User_Data_Manager {
    //创建
    public static void NewFile (){
        Properties properties = new Properties();
        OutputStream output = null;
        try {
            properties.store(new FileWriter("Config.properties"), "Anime Index Config File");
        } catch (IOException io) {
            System.err.println("===========ERROR===========");
            io.printStackTrace();
        }
    }

    //读取
    static String property = null;
    public static void ReadSet(String Set) throws IOException {
        Properties properties = new Properties();
        FileInputStream input = new FileInputStream("Config.properties");
        properties.load(input);
        properties.getProperty(Set);
    }

    //新增
    public static void AddSet (String Set,String Val) {
        Properties properties = new Properties();
        OutputStream output = null;
        try {
            output = new FileOutputStream("Config.properties");
            properties.setProperty(Set, Val);
            properties.store(output, "Anime Index Config File");
        } catch (IOException io) {
            System.err.println("===========ERROR===========");
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                }
                catch (IOException e)
                {
                    System.err.println("===========ERROR===========");
                    e.printStackTrace();
                }
            }
        }
    }
    //编辑
    public static void EditSet (String Set,String NewVal) {
        Properties properties = new Properties();
        OutputStream output = null;
        try {
            output = new FileOutputStream("Config.properties");
            properties.setProperty(Set, NewVal);
            properties.store(output, "Anime Index Config File");
        } catch (IOException io) {
            System.err.println("===========ERROR===========");
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                }
                catch (IOException e)
                {
                    System.err.println("===========ERROR===========");
                    e.printStackTrace();
                }
            }
        }

    };
    //销毁
    public static void RemoveSet (String Set,String Val) {
        Properties properties = new Properties();
        OutputStream output = null;
        try {
            output = new FileOutputStream("Config.properties");
            properties.remove(Set,Val);
            properties.store(output, "Anime Index Config File");
        } catch (IOException io) {
            System.err.println("===========ERROR===========");
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                }
                catch (IOException e)
                {
                    System.err.println("===========ERROR===========");
                    e.printStackTrace();
                }
            }
        }
    };
    //清空
    public static void Clear () {
        Properties properties = new Properties();
        OutputStream output = null;
        try {
            output = new FileOutputStream("Config.properties");
            properties.clear();
            properties.store(output, "Anime Index Config File");
        } catch (IOException io) {
            System.out.println("===========ERROR===========");
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                }
                catch (IOException e)
                {
                    System.out.println("===========ERROR===========");
                    e.printStackTrace();
                }
            }
        }

    }
}