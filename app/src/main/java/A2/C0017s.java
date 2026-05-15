package A2;

import android.os.Looper;
import t2.C1476e;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: renamed from: A2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0017s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YosPlaybackService f419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2.o f420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0014o f421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0015p f422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0015p f423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0015p f424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Looper f425g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C1476e f426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f428k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v0 f430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f432p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0009j f434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f436t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f437u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f438v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f439w;

    public C0017s(YosPlaybackService yosPlaybackService, f6.b bVar) {
        C0014o c0014o = new C0014o(0, bVar);
        C0015p c0015p = new C0015p(yosPlaybackService, 0);
        C0015p c0015p2 = new C0015p(yosPlaybackService, 1);
        C0015p c0015p3 = new C0015p(yosPlaybackService, 2);
        this.f419a = yosPlaybackService;
        this.f421c = c0014o;
        this.f422d = c0015p;
        this.f423e = c0015p2;
        this.f424f = c0015p3;
        this.f425g = w2.t.o();
        this.f426i = C1476e.f16413g;
        this.l = 1;
        this.f429m = true;
        this.f430n = v0.f458c;
        this.f431o = 5000L;
        this.f432p = 15000L;
        this.f433q = 3000L;
        this.f434r = new C0009j(w2.t.D(20L), w2.t.D(500L));
        this.f420b = w2.o.f18873a;
        this.f435s = 500L;
        this.f436t = 2000L;
        this.f437u = true;
        this.f439w = "";
        this.h = -1000;
    }
}
