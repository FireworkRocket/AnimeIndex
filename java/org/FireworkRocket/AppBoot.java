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
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import org.FireworkRocket.Anime_Index_Data_Manager.User_Data_Manager;
import org.FireworkRocket.Anime_Index_Setting.DefSet;

import javax.swing.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


public class AppBoot {
    public static void UserData() {
        File file = new File("Config.properties");
        if (!file.exists()) {
            User_Data_Manager.NewFile();
            System.out.println(">>>>>>>>>>>> [INFO] 用户配置已创建 >>>>>>>>>>>>");
        } else {
            System.out.println(">>>>>>>>>>>> [INFO] 用户配置已存在 >>>>>>>>>>>>");
        }
   }
    public static void changeLabelContent(FxmlControl controller) {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("HH");
        String str = df.format(date);
        int Time = Integer.parseInt(str);
        Map<String, String> map = System.getenv();
        String userName = map.get("USERNAME");// 获取用户名
        if (Time >= 0 && Time <= 6) {
            controller.WelcomeText.setText(userName+"，凌晨了，注意休息"); // 修改全局Label的内容
        }
        if (Time > 6 && Time <= 13) {
            controller.WelcomeText.setText("上午好，"+userName);
        }
        if (Time > 13 && Time <= 18) {
            controller.WelcomeText.setText("下午好，"+userName);
        }
        if (Time > 18 && Time <= 24) {
            controller.WelcomeText.setText("晚上好，"+userName);
        }
    }
    public static void start() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.AppHome.class.getResource("AppHome.fxml"));
            Scene scene = new Scene(loader.load());
            Stage PrimaryStage = new Stage();
            PrimaryStage.getIcons().add(new Image("Icon/Anime_Index.png"));
            PrimaryStage.setScene(scene);
            PrimaryStage.setResizable(false);
            PrimaryStage.setTitle("Anime Index");
            FxmlControl controller = loader.getController();
            AppBoot AppBoot = new AppBoot();
            AppBoot.changeLabelContent(controller);
            PrimaryStage.show();
        } catch (Exception ex) {
            System.err.println("===========ERROR===========");
            JOptionPane.showMessageDialog(null, "遇到一个致命错误，软件无法继续启动\n" + "关于异常可能有用的信息：\n" + ex + "\n请点击确定以退出...", "ERROR", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(1);
        }
    }
    public static void Unexpected_shutdown() {
        Platform.runLater(() -> {System.out.println("=========== [Warn] 上次未能正确关闭===========");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("警告");
            alert.setHeaderText("Anime Index 未能正确关闭");
            alert.setContentText("请核对下载的资源与你的个人配置文件，因为软件意外关闭，你所做的更改可能未完成。");
            alert.show();
        });
    }
}