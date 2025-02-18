package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        // 음악 플레이어 켜기
        mp.on();
        // 볼륨 증가
        mp.volumeUp();
        // 볼륨 증가
        mp.volumeUp();
        // 볼륨 감소
        mp.volumeDown();
        // 음악 플레이어 상태
        mp.showStatus();
        // 음악 플레이어 끄기
        mp.off();
    }
}
