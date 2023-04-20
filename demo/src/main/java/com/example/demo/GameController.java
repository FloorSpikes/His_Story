package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {


    @FXML
    private MediaView mediaView;

    @FXML
    private Button playButton;
    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        file = new File("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\demo\\src\\main\\java\\video\\game-intro.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);

    }
    public void playMedia() {
        mediaPlayer.play();
    }
}