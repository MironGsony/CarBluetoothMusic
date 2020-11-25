package com.miron.carbtmusic;

import android.content.Context;
import android.media.MediaMetadata;

public interface IBtMusicManager {
    boolean ismBtPlayState();

    long getCurrentTotleTime();

    long getCurrentProgress();

    MediaMetadata getCurrentMediaInfo();

    void sendNextCmd();

    void sendPastCmd();

    void sendPlayPauseCmd(boolean isAvrcpPlayStatus);

    void setAudioStreamMode(boolean on);

    String getBTDeviceNamePlane();

    String getBTDeviceName();

    String getBTAdapterName();

    boolean isPlay();

    boolean isUsedBt();

    void unRegisterProfile();

    void initConnectDevice();

    void unregisterBtReceiver(Context context);
    void initBtData(Context context);

}
