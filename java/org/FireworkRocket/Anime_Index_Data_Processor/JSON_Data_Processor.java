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

package org.FireworkRocket.Anime_Index_Data_Processor;

import com.google.gson.Gson;
import java.util.HashMap;

public class JSON_Data_Processor {
    //新建JSON文档
    public static void NewJsonFile(){

    }
    //读取现有JSON文档数据
    public static void ReadJsonFile(){
        HashMap map = new Gson().fromJson("{\"name\":\"小明\",\"age\":20}", HashMap.class);
        System.out.println("code" + map.get("code"));
        System.out.println("年龄：" + map.get("age"));
    }

}
