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

import io.github.palexdev.materialfx.controls.MFXButton;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import io.github.palexdev.materialfx.controls.MFXProgressBar;
import io.github.palexdev.materialfx.controls.MFXScrollPane;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.apache.commons.lang3.exception.ExceptionContext;


public class FxmlControl {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;


    @FXML // fx:id="AllTabsClosed"
    private MFXButton AllTabsClosed; // Value injected by FXMLLoader

    @FXML // fx:id="PrBar"
    private MFXProgressBar PrBar; // Value injected by FXMLLoader

    @FXML // fx:id="WelcomeText"
    public Label WelcomeText; // Value injected by FXMLLoader

    @FXML // fx:id="akeybu"
    private MFXButton akeybu; // Value injected by FXMLLoader

    @FXML // fx:id="HomePane"
    private AnchorPane HomePane; // Value injected by FXMLLoader

    @FXML // fx:id="Updatebu"
    private MFXButton Updatebu; // Value injected by FXMLLoader

    @FXML // fx:id="hideabu"
    private MFXButton hideabu; // Value injected by FXMLLoader

    @FXML // fx:id="himg"
    private ImageView himg; // Value injected by FXMLLoader

    @FXML // fx:id="hingbu"
    private MFXButton hingbu; // Value injected by FXMLLoader

    @FXML // fx:id="homebu"
    private MFXButton homebu; // Value injected by FXMLLoader

    @FXML // fx:id="hsrchbu"
    private MFXButton hsrchbu; // Value injected by FXMLLoader

    @FXML // fx:id="hvcdbu"
    private MFXButton hvcdbu; // Value injected by FXMLLoader

    @FXML // fx:id="ideabu"
    private MFXButton ideabu; // Value injected by FXMLLoader

    @FXML // fx:id="newtabbu"
    private MFXButton newtabbu; // Value injected by FXMLLoader

    @FXML // fx:id="newwinbu"
    private MFXButton newwinbu; // Value injected by FXMLLoader

    @FXML // fx:id="picbu"
    private MFXButton picbu; // Value injected by FXMLLoader

    @FXML // fx:id="pugbu"
    private MFXButton pugbu; // Value injected by FXMLLoader

    @FXML // fx:id="setbu"
    private MFXButton setbu; // Value injected by FXMLLoader

    @FXML // fx:id="srchbu"
    private MFXButton srchbu; // Value injected by FXMLLoader

    @FXML // fx:id="tabpane"
    public TabPane tabpane; // Value injected by FXMLLoader

    @FXML // fx:id="vcdbu"
    private MFXButton vcdbu; // Value injected by FXMLLoader

    @FXML // fx:id="bordok"
    private MFXButton bordok; // Value injected by FXMLLoader

    @FXML // fx:id="keybord_pane"
    private AnchorPane keybord_pane; // Value injected by FXMLLoader

    @FXML // fx:id="APISet"
    private MFXButton APISet; // Value injected by FXMLLoader

    @FXML // fx:id="PicGridPane"
    private GridPane PicGridPane; // Value injected by FXMLLoader

    @FXML // fx:id="PicSocPane"
    private MFXScrollPane PicSocPane; // Value injected by FXMLLoader

    @FXML // fx:id="ReGetPic"
    private MFXButton ReGetPic; // Value injected by FXMLLoader

    @FXML
    void AllTabsClosedBU(ActionEvent event) {
        try {
            AnchorPane other = FXMLLoader.load(getClass().getResource("AppHome.fxml"));
            ((Button)event.getSource()).getScene().setRoot(other);
        } catch (IOException e) {
            System.err.println("===========ERROR===========");
            throw new RuntimeException(e);
        }
    }

    @FXML
    void TabClosed(Event event) {
        if (tabpane.getSelectionModel().getSelectedIndex() < 0 ){
            System.out.println("Run");
            homebu.setDisable(true);
            picbu.setDisable(true);
            vcdbu.setDisable(true);
            srchbu.setDisable(true);
            pugbu.setDisable(true);
            ideabu.setDisable(true);
            setbu.setDisable(true);
        }
    }

    @FXML
    public void akeybu(ActionEvent event) {
        try {
            Parent anotherRoot = FXMLLoader.load(getClass().getResource("keyboard.fxml"));
            Stage anotherStage = new Stage();
            anotherStage.setTitle("Anime Index - 定义快捷键");
            anotherStage.getIcons().add(new Image("Icon/Anime_Index.png"));
            anotherStage.setScene(new Scene(anotherRoot, 693, 279));
            anotherStage.setResizable(false);
            anotherStage.show();
        } catch (Exception e){
            System.err.println("===========ERROR===========");
            e.printStackTrace();
        }
    }
    public void All_Window_Exit() {
        Platform.exit();
    }

    @FXML
    void Updatebu(ActionEvent event) {

    }

    @FXML
    void himgrecd(ScrollEvent event) {

    }
    @FXML
    void homebu(ActionEvent event) {
        try {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("Tab_AppHome.fxml"));
            } catch (IOException e) {
                System.err.println("===========ERROR===========");
                throw new RuntimeException(e);
            }
            Tab tab = new Tab("Anime Index：图片", root);
            int TabIndex = tabpane.getSelectionModel().getSelectedIndex();
            tabpane.getTabs().set(TabIndex, tab);
            tabpane.getSelectionModel().select(TabIndex);
            tabpane.getTabs().set(TabIndex, tabpane.getTabs().get(TabIndex)).setText("Anime Index：主页");
        }catch (Exception Ex) {
            System.err.println("===========ERROR===========");
            System.err.println("ERROR:标签页最底部");
        }
    }

    @FXML
    void ideabu(ActionEvent event) {

    }

    @FXML
    void newtabbu(ActionEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("Tab_AppHome.fxml"));
        } catch (IOException e) {
            System.err.println("===========ERROR===========");
            throw new RuntimeException(e);
        }
        Tab tab = new Tab("Anime Index：主页",root);
        tabpane.getTabs().add(tab);
        if (tabpane.getSelectionModel().getSelectedIndex() <= 0 ){
            homebu.setDisable(false);
            picbu.setDisable(false);
            vcdbu.setDisable(false);
            srchbu.setDisable(false);
            pugbu.setDisable(false);
            ideabu.setDisable(false);
            setbu.setDisable(false);
        }
    }

    @FXML
    void newwinbu(ActionEvent event) {AppBoot.start();}

    @FXML
    void picbu(ActionEvent event) {
        try{
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("AppPic.fxml"));
        } catch (IOException e) {
            System.err.println("===========ERROR===========");
            throw new RuntimeException(e);
        }
        Tab tab = new Tab("Anime Index：图片",root);
        int TabIndex = tabpane.getSelectionModel().getSelectedIndex();
        tabpane.getTabs().set(TabIndex,tab);
        tabpane.getSelectionModel().select(TabIndex);
        tabpane.getTabs().set(TabIndex,tabpane.getTabs().get(TabIndex)).setText("Anime Index：主页");
         }catch (Exception Ex) {
            System.err.println("===========ERROR===========");
            System.err.println("ERROR:标签页错误\n"+Ex);
        }
        /*Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("AppPic.fxml"));
        } catch (IOException e) {
            System.err.println("===========ERROR===========");
            throw new RuntimeException(e);
        }
        Tab tab = new Tab("Anime Index：图片",root);
        tabpane.getTabs().add(tab);*/

    }

    @FXML
    void vcdbu(ActionEvent actionEvent) {

    }

    @FXML
    void pugbu(ActionEvent event) {

    }

    @FXML
    void setbu(ActionEvent event) {

    }

    @FXML
    void srchbu(ActionEvent event) {

    }
    @FXML
    void picbu_1(ActionEvent event) {
        try {
            Tab tab = new Tab();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AppHome.fxml"));
            AnchorPane content = loader.load();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void vcdbu_1(ActionEvent event) {

    }

    @FXML
    void ideabu_1(ActionEvent event) {
    }

    @FXML
    void srchbu_1(ActionEvent event) {

    }

    @FXML
    void APISet(ActionEvent event) {

    }

    @FXML
    void APIset(ScrollEvent event) {

    }

    @FXML
    void PicGet(ScrollEvent event) {

    }

    @FXML
    void RePicGet(ActionEvent event) {

    }

    @FXML
    public void bordok() {
        Stage stage = (Stage)bordok.getScene().getWindow();
        stage.close();
    }
    /*
       Tab tab = new Tab();
       FXMLLoader loader = new FXMLLoader(getClass().getResource("AppPic.fxml"));
        AnchorPane content = null;
        try {
            content = loader.load();
       } catch (IOException e) {
            throw new RuntimeException(e);
        }
        tab.setContent(content);
       int TabIndex = tabpane.getSelectionModel().getSelectedIndex();
        tabpane.getTabs().set(TabIndex,tab);
        tabpane.getTabs().set(TabIndex,tabpane.getTabs().get(TabIndex)).setText("Anime Index：图片");
     */


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert AllTabsClosed != null : "fx:id=\"AllTabsClosed\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert HomePane != null : "fx:id=\"HomePane\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert WelcomeText != null : "fx:id=\"WelcomeText\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert Updatebu != null : "fx:id=\"Updatebu\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert akeybu != null : "fx:id=\"akeybu\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert hideabu != null : "fx:id=\"hideabu\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert himg != null : "fx:id=\"himg\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert hingbu != null : "fx:id=\"hingbu\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert homebu != null : "fx:id=\"homebu\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert hsrchbu != null : "fx:id=\"hsrchbu\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert hvcdbu != null : "fx:id=\"hvcdbu\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert ideabu != null : "fx:id=\"ideabu\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert newtabbu != null : "fx:id=\"newtabbu\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert newwinbu != null : "fx:id=\"newwinbu\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert picbu != null : "fx:id=\"picbu\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert pugbu != null : "fx:id=\"pugbu\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert setbu != null : "fx:id=\"setbu\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert srchbu != null : "fx:id=\"srchbu\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert tabpane != null : "fx:id=\"tabpane\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert vcdbu != null : "fx:id=\"vcdbu\" was not injected: check your FXML file 'AppHome.fxml'.";
        assert bordok != null : "fx:id=\"bordok\" was not injected: check your FXML file 'keyboard.fxml'.";
        assert keybord_pane != null : "fx:id=\"keybord_pane\" was not injected: check your FXML file 'keyboard.fxml'.";
        assert APISet != null : "fx:id=\"APISet\" was not injected: check your FXML file 'AppPic.fxml'.";
        assert PicGridPane != null : "fx:id=\"PicGridPane\" was not injected: check your FXML file 'AppPic.fxml'.";
        assert PicSocPane != null : "fx:id=\"PicSocPane\" was not injected: check your FXML file 'AppPic.fxml'.";
        assert PrBar != null : "fx:id=\"PrBar\" was not injected: check your FXML file 'AppPic.fxml'.";
        assert ReGetPic != null : "fx:id=\"ReGetPic\" was not injected: check your FXML file 'AppPic.fxml'.";
    }

}