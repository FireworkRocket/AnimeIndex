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

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.*;
import java.io.*;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javafx.stage.WindowEvent;
import org.FireworkRocket.Anime_Index_Data_Manager.User_Data_Manager;
import org.FireworkRocket.Anime_Index_Setting.DefSet;

public class Main extends Application {
    private static Label InfoLb;
    private static Label ErrorLb;
    @Override
        public void start(Stage BootGUI) throws Exception {
            Image image = new Image("Icon/Bootoimg.png");
            ImageView view = new ImageView(image);
            InfoLb = new Label();
            ErrorLb = new Label();
            InfoLb.setTextFill(Color.WHITE);
            ErrorLb.setTextFill(Color.rgb(243,81,81));
            AnchorPane.setRightAnchor(InfoLb, 15.0);
            AnchorPane.setBottomAnchor(InfoLb, 13.0);
            AnchorPane.setLeftAnchor(ErrorLb,40.0);
            AnchorPane.setTopAnchor(ErrorLb, 155.0);
            InfoLb.setFont(new Font("System", 20));
            ErrorLb.setFont(new Font("System",16));
            ErrorLb.setMaxWidth(750);
            ErrorLb.setWrapText(true);
            AnchorPane pane = new AnchorPane();
            pane.getChildren().addAll(view, InfoLb, ErrorLb);
            BootGUI.setTitle("Anime Index Booting...");
            BootGUI.setScene(new Scene(pane));
            BootGUI.setWidth(image.getWidth());
            BootGUI.setHeight(image.getHeight());
            BootGUI.initStyle(StageStyle.UNDECORATED);
            BootGUI.getIcons().add(new Image("Icon/Anime_Index.png"));
            BootGUI.show();
            //显示窗体
            new Thread(() -> {
                Boot();
                Platform.runLater(() -> {
                    BootGUI.close();
                    AppHome.start();
                });
            }).start();
        }
        private void Boot() {
            try {
                showInfo("请稍后");
                showInfo("正在启动...");
                showInfo("正在测试Ping...");
                if (DefSet.TodayPing) {
                    //测试加入感叹号
                    String line = null;
                    try {
                        System.out.println("============PingTest============");
                        Process pro = Runtime.getRuntime().exec("\"C:\\Users\\Windows\\IdeaProjects\\Anime Index\\src\\main\\java\\org\\FireworkRocket\\TestPing.Cmd\" ");
                        BufferedReader buf = new BufferedReader(new InputStreamReader(
                                pro.getInputStream()));
                        BufferedReader reader = new BufferedReader(new InputStreamReader(pro.getInputStream()));
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                        reader.close();
                    } catch (Exception ex) {
                        System.err.println("===========ERROR===========");
                        showError("Exception: "+ex);
                        showInfo("启动异常");
                        Thread.sleep(1000);
                        JOptionPane.showMessageDialog(null, "测试API连通性时遇到异常\n" + "关于异常可能有用的信息：\n" + ex + "\n程序已暂停，单击\"确定\"以跳过此异常", "ERROR", JOptionPane.ERROR_MESSAGE);
                        System.out.println(ex.getMessage());
                        System.err.println("===========ERROR===========");
                    }
                    DefSet.TodayPing = true;
                    System.out.println("============PingTestEnd============");
                }
                showInfo("加载设置...");
                AppBoot.UserData();
                showInfo("加载自启动类脚本...");
                showInfo("就绪");
            } catch (Throwable e) {
                System.err.println("===========ERROR===========");
                showError("Error: " +e);
                showInfo("致命错误");
                JOptionPane.showMessageDialog(null, "遇到致命错误，软件无法继续启动\n" + "关于异常可能有用的信息：\n" + e + "\n请点击确定以退出...", "ERROR", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
                System.exit(1);
            }
        }
//方法：展示当前加载项
        public static void showInfo(String info) {
            Platform.runLater(() -> InfoLb.setText(info));
        }
//方法：展示当前错误
        public static void showError(String Error) {
            Platform.runLater(() -> ErrorLb.setText(Error));
        }

        public static class AppHome extends Stage {
            public static void start() {
                try {
                    FXMLLoader loader = new FXMLLoader(AppHome.class.getResource("AppHome.fxml"));
                    Scene scene = new Scene(loader.load());
                    Stage PrimaryStage = new Stage();
                    PrimaryStage.getIcons().add(new Image("Icon/Anime_Index.png"));
                    PrimaryStage.setScene(scene);
                    PrimaryStage.setResizable(false);
                    PrimaryStage.setTitle("Anime Index");
                    PrimaryStage.setOnCloseRequest(event -> System.exit(0));
                    FxmlControl controller = loader.getController();
                    AppBoot AppBoot = new AppBoot();
                    AppBoot.changeLabelContent(controller);
                    PrimaryStage.show();
                    PrimaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                        @Override
                        public void handle(WindowEvent event) {
                            System.exit(0);
                        }
                    });
                } catch (Exception ex) {
                    System.err.println("===========ERROR===========");
                    JOptionPane.showMessageDialog(null, "遇到一个致命错误，软件无法继续启动\n" + "关于异常可能有用的信息：\n" + ex + "\n请点击确定以退出...", "ERROR", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                    System.exit(1);
                }
            }
        }
        public static void main(String[] args) {
            launch(args);
        }
}