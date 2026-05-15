package y2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class k extends IOException {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f20337p = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f20338o;

    public k(int i7) {
        this.f20338o = i7;
    }

    public k(Exception exc, int i7) {
        super(exc);
        this.f20338o = i7;
    }

    public k(String str, Exception exc, int i7) {
        super(str, exc);
        this.f20338o = i7;
    }
}
