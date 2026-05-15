package w3;

import android.media.VolumeProvider;
import android.os.Build;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a */
    public final int f19324a;

    /* JADX INFO: renamed from: b */
    public final int f19325b;

    /* JADX INFO: renamed from: c */
    public final String f19326c;

    /* JADX INFO: renamed from: d */
    public int f19327d;

    /* JADX INFO: renamed from: e */
    public VolumeProvider f19328e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Handler f19329f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ r1 f19330g;

    public p1(r1 r1Var, int i7, int i8, int i9, String str, Handler handler) {
        this.f19330g = r1Var;
        this.f19329f = handler;
        this.f19324a = i7;
        this.f19325b = i8;
        this.f19327d = i9;
        this.f19326c = str;
    }

    public final VolumeProvider a() {
        p1 p1Var;
        if (this.f19328e != null) {
            p1Var = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            p1Var = this;
            p1Var.f19328e = new x3.o0(p1Var, this.f19324a, this.f19325b, this.f19327d, this.f19326c);
        } else {
            p1Var = this;
            p1Var.f19328e = new x3.p0(this, p1Var.f19324a, p1Var.f19325b, p1Var.f19327d);
        }
        return p1Var.f19328e;
    }
}
