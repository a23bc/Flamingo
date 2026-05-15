package p6;

import Y4.o;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import m5.AbstractC1209k;
import w5.InterfaceC1765B;
import yos.music.player.data.libraries.Folder;
import yos.music.player.data.libraries.MusicLibrary;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f15116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f15117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Folder f15118q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, boolean z6, Folder folder, c5.d dVar) {
        super(2, dVar);
        this.f15116o = context;
        this.f15117p = z6;
        this.f15118q = folder;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new g(this.f15116o, this.f15117p, this.f15118q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        g gVar = (g) create((InterfaceC1765B) obj, (c5.d) obj2);
        o oVar = o.f8736a;
        gVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        Context context = this.f15116o;
        AbstractC1209k.f(context, "context");
        Object systemService = context.getSystemService("vibrator");
        AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        Vibrator vibrator = (Vibrator) systemService;
        if (Build.VERSION.SDK_INT >= 29) {
            vibrator.vibrate(VibrationEffect.createPredefined(0));
        } else {
            vibrator.vibrate(30L);
        }
        boolean z6 = this.f15117p;
        Folder folder = this.f15118q;
        if (z6) {
            MusicLibrary.INSTANCE.unHideFolder(folder);
        } else {
            MusicLibrary.INSTANCE.hideFolder(folder);
        }
        return o.f8736a;
    }
}
