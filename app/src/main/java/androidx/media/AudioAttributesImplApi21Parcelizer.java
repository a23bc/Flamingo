package androidx.media;

import M3.b;
import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(b bVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f9767a = (AudioAttributes) bVar.g(audioAttributesImplApi21.f9767a, 1);
        audioAttributesImplApi21.f9768b = bVar.f(audioAttributesImplApi21.f9768b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, b bVar) {
        bVar.getClass();
        bVar.k(audioAttributesImplApi21.f9767a, 1);
        bVar.j(audioAttributesImplApi21.f9768b, 2);
    }
}
