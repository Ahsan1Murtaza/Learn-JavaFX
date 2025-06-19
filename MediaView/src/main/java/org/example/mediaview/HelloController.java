package org.example.mediaview;

import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {

    @FXML
    MediaView mediaView;

    @FXML
    Button onPlay, onPause, onReset;


    File file;
    Media media;
    MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        file = new File("video.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        mediaView.setMediaPlayer(mediaPlayer);
    }

    public void onPlay(){
        mediaPlayer.play();
    }
    public void onPause(){
        mediaPlayer.pause();
    }
    public void onReset(){
        mediaPlayer.seek(Duration.seconds(0.0));
    }


}