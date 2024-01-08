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

package org.FireworkRocket.Anime_Index_Setting;

public class DefSet {
    //==================|软件默认设置|==================
    public static int PicNum = 10; //API单个图片获取数量设置
    public static boolean OfflineMode = false; //离线模式设置
    public static boolean DwnBool = true; //下载冷却、仅预览设置
    public static boolean R18Picbool = false; //R18图片获取设置😐
    public static boolean TestAPI = true; //启动时自动测试API连通性设置
    public static boolean TodayPing = false;//今天是否测试API连通性
    public static boolean DwnPicRetouch = false; //下载图片后自动进入修图设置
    public static boolean AutoDwnPic = false; //每日自动下载图片设置
    public static boolean AutoDwnAme = false; //每日自动下载番剧设置
    public static boolean AutoSetBg = false; //每日自动设置壁纸设置

    //=========|搜索设置|=========
    public static boolean BaiDuSearch = true; //是否使用百度？
    public static boolean BingSearch = true; //是否使用必应？
    public static boolean MoeGirlWiki = true; //是否使用萌娘百科？
    public static boolean BiliBili_index = true; //是否使用哔哩哔哩？
    public static boolean Wikipedia = true; //是否使用维基百科？
    public static boolean GoogleSearch = true; //是否使用谷歌？
    // ==================|软件默认设置|==================
}
