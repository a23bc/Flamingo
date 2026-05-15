package p6;

import Y4.o;
import android.content.Context;
import android.widget.Toast;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import w5.InterfaceC1765B;
import yos.music.player.R;
import yos.music.player.data.libraries.MusicLibrary;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15105o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f15106p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f15107q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(2, dVar);
        this.f15106p = context;
        this.f15107q = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new c(this.f15106p, this.f15107q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f15105o;
        Context context = this.f15106p;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            MusicLibrary musicLibrary = MusicLibrary.INSTANCE;
            this.f15105o = 1;
            if (musicLibrary.scanMedia(context, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        InterfaceC0878b0 interfaceC0878b0 = this.f15107q;
        Toast toast = (Toast) interfaceC0878b0.getValue();
        if (toast != null) {
            toast.cancel();
        }
        int size = MusicLibrary.INSTANCE.getSongs().size();
        Toast toastMakeText = size == 0 ? Toast.makeText(context, R.string.tip_no_song, 0) : Toast.makeText(context, context.getString(R.string.tip_scan_finished, new Integer(size)), 0);
        toastMakeText.show();
        interfaceC0878b0.setValue(toastMakeText);
        return o.f8736a;
    }
}
