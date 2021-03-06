package com.example.player101;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MusicService extends Service {

    MusicPlayer musicPlayer;
    //private final IBinder iBinder= new MyBinder();

    public static final String COMPLETE_INTENT = "complete intent";
    public static final String MUSICNAME = "music name";

    @Override
    public void onCreate() {
        super.onCreate();
        musicPlayer = new MusicPlayer(this);
    }

    public void startMusic(){

        musicPlayer.playMusic();
    }

    public void pauseMusic(){

        musicPlayer.pauseMusic();
    }

    public void resumeMusic(){

        musicPlayer.resumeMusic();
    }

    public int getPlayingStatus(){

        return musicPlayer.getMusicStatus();
    }