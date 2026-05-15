package androidx.media;

import M3.b;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f9769a = bVar.f(audioAttributesImplBase.f9769a, 1);
        audioAttributesImplBase.f9770b = bVar.f(audioAttributesImplBase.f9770b, 2);
        audioAttributesImplBase.f9771c = bVar.f(audioAttributesImplBase.f9771c, 3);
        audioAttributesImplBase.f9772d = bVar.f(audioAttributesImplBase.f9772d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.getClass();
        bVar.j(audioAttributesImplBase.f9769a, 1);
        bVar.j(audioAttributesImplBase.f9770b, 2);
        bVar.j(audioAttributesImplBase.f9771c, 3);
        bVar.j(audioAttributesImplBase.f9772d, 4);
    }
}
