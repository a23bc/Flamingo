package W5;

import Y4.o;
import android.content.Context;
import f0.C0912t;
import m5.AbstractC1209k;
import y0.C1987t;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l5.i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f7831o = new a();

    @Override // l5.i
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i7;
        YosMediaItem yosMediaItem = (YosMediaItem) obj2;
        Context context = (Context) obj3;
        long j3 = ((C1987t) obj4).f20264a;
        C0912t c0912t = (C0912t) obj5;
        int iIntValue = ((Number) obj6).intValue();
        AbstractC1209k.f(context, "thisContext");
        int i8 = iIntValue & 6;
        long j7 = ((n1.i) obj).f14513a;
        if (i8 == 0) {
            i7 = (c0912t.e(j7) ? 4 : 2) | iIntValue;
        } else {
            i7 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i7 |= c0912t.f(yosMediaItem) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i7 |= c0912t.f(context) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i7 |= c0912t.e(j3) ? 2048 : 1024;
        }
        if ((i7 & 9363) == 9362 && c0912t.z()) {
            c0912t.Q();
        } else {
            android.support.v4.media.session.b.b(j7, yosMediaItem, context, j3, c0912t, i7 & 8190);
        }
        return o.f8736a;
    }
}
