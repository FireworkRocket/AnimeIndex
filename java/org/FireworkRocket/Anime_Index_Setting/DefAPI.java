/*
 Copyright [2024] [FireworkRocket@126.com]

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

import org.FireworkRocket.Recommend_Main;

public class DefAPI {

    //==================|API列表|==================

    //##############|图片API|##############

    //↓↓↓↓↓↓↓↓|JSON类型|↓↓↓↓↓↓↓↓
    public static String DmoeAPI = "https://www.dmoe.cc/random.php?return=json";
    public static String JitsuAPI = "https://moe.jitsu.top/img/?size=1080p&type=json&num="+DefSet.PicNum;
    public static String YuBanAPI = "https://ybapi.cn/API/pixiv.php?type=json"+"&R18"+DefSet.R18Picbool;
    public static String YuBanAPI2 = "https://ybapi.cn/API/pixiv.php?type=json";
    public static String MoeHuAPI = "https://img.moehu.org/pic.php?return=json&id=img1&num="+DefSet.PicNum;
    public static String MoeHuAPI2 = "https://img.moehu.org/pic.php?return=json&id=img2&num="+DefSet.PicNum;
    public static String CiYuanAPI = "https://t.mwm.moe/ycy?json";
    public static String WuMingAPI = "https://jkapi.com/api/acg_img?type=json";
    public static String JitsuAPIR18 = "https://moe.jitsu.top/img/?sort=r18&size=1080p&type=json&num="+DefSet.PicNum;
    public static String LolicaonAPI = "https://api.lolicon.app/setu/v2/?num="+DefSet.PicNum+"&r18"+DefSet.R18Picbool+"&tag"+ "["+Recommend_Main.MyLikeLabel+"]";
    public static String SexPhotoAPI = "https://sex.nyan.xyz/api/v2/?num="+DefSet.PicNum+"&r18="+DefSet.R18Picbool+"&tag="+ "["+Recommend_Main.MyLikeLabel+"]";
    public static String likepoemsAPI = "https://api.likepoems.com/img/pc/?type=json&id="+DefSet.PicNum;
    public static String HanXiaoXinAPI = "https://api.vvhan.com/api/acgimg?type=json";
    //↑↑↑↑↑↑↑↑|JSON类型|↑↑↑↑↑↑↑↑

    //↓↓↓↓↓↓↓↓|直图输出类型|↓↓↓↓↓↓↓↓

    //---------|樱道API😫|---------
    public static String YingDaoAPI = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合1";
    public static String YingDaoAPI2 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合2";
    public static String YingDaoAPI3 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合3";
    public static String YingDaoAPI4 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合4";
    public static String YingDaoAPI5 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合5";
    public static String YingDaoAPI6 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合6";
    public static String YingDaoAPI7 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合7";
    public static String YingDaoAPI8 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合8";
    public static String YingDaoAPI9 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合9";
    public static String YingDaoAPI10 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合10";
    public static String YingDaoAPI11 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合11";
    public static String YingDaoAPI12 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合12";
    public static String YingDaoAPI13 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合13";
    public static String YingDaoAPI14 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合14";
    public static String YingDaoAPI15 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合15";
    public static String YingDaoAPI16 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合16";
    public static String YingDaoAPI17 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合17";
    public static String YingDaoAPI18 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=动漫综合18";
    public static String YingDaoAPI20 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=P站系列1";
    public static String YingDaoAPI21 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=P站系列2";
    public static String YingDaoAPI22 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=P站系列3";
    public static String YingDaoAPI23 = "https://api.r10086.com/樱道随机图片api接口.php?图片系列=P站系列4";

    //---------|樱道API😫|---------

    public static String LoliAPI = "https://www.loliapi.com/acg/pc/";
    public static String AaYaoAPI = "https://api.ayao.ltd/PC/api.php";
    public static String QingyuanAPI = "http://www.98qy.com/sjbz/api.php?lx=dongman&format=images";
    //↑↑↑↑↑↑↑↑|直图输出类型|↑↑↑↑↑↑↑

    //##############|图片API|##############

    //##############|番剧/视频 API|##############
    //public static String VCD = "";
    //哪个大佬行行好给个番剧API，要JSON格式的
    //##############|番剧/视频 API|##############

    //==================|API列表|==================
}
