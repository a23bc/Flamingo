package i6;

import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0084z;
import D.h0;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import a.AbstractC0509a;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.hchen.superlyricapi.SuperLyricTool;
import d0.AbstractC0805u;
import d0.C0803s;
import d2.C0821i;
import f0.C0879c;
import f0.C0888g0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.W;
import h6.C1048w;
import j5.AbstractC1110d;
import java.util.List;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import o0.C1247d;
import o5.AbstractC1267a;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.InterfaceC1398p;
import y0.AbstractC1959I;
import yos.music.player.R;
import yos.music.player.data.libraries.MusicLibrary;
import yos.music.player.data.libraries.SettingsLibrary;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class e implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13524o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y3.x f13525p;

    public /* synthetic */ e(y3.x xVar, int i7) {
        this.f13524o = i7;
        this.f13525p = xVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13524o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    String strS = I0.c.S(R.string.page_library_songs, c0912t);
                    List<YosMediaItem> songs = ((Boolean) a6.b.f8884b.getValue()).booleanValue() ? MusicLibrary.INSTANCE.getSongs() : Z4.v.f8818o;
                    D0.b bVarB = AbstractC1267a.B(R.drawable.ic_library_link_icon_songs, c0912t);
                    c0912t.X(1669094982);
                    boolean zF = c0912t.f(strS) | c0912t.f(songs);
                    y3.x xVar = this.f13525p;
                    boolean zH = zF | c0912t.h(xVar);
                    Object objK = c0912t.K();
                    if (zH || objK == C0903o.f11850a) {
                        objK = new F.n(strS, songs, xVar, 7);
                        c0912t.i0(objK);
                    }
                    c0912t.p(false);
                    android.support.v4.media.session.b.a(bVarB, strS, (InterfaceC1180a) objK, c0912t, 0);
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    g.n(false, I0.c.S(R.string.settings_library_refresh_everytime, c0912t2), new C1048w(21), new C1048w(22), c0912t2, 27648);
                    AbstractC1113a.j(null, c0912t2, 0);
                    String strS2 = I0.c.S(R.string.settings_library_overview, c0912t2);
                    c0912t2.X(-1773362882);
                    y3.x xVar2 = this.f13525p;
                    boolean zH2 = c0912t2.h(xVar2);
                    Object objK2 = c0912t2.K();
                    if (zH2 || objK2 == C0903o.f11850a) {
                        objK2 = new d(xVar2, 12);
                        c0912t2.i0(objK2);
                    }
                    c0912t2.p(false);
                    g.f(false, strS2, null, false, (InterfaceC1180a) objK2, c0912t2, 0, 13);
                }
                break;
            case 2:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    String strS3 = I0.c.S(R.string.settings_library_refresh_now, c0912t3);
                    c0912t3.X(-1773345509);
                    y3.x xVar3 = this.f13525p;
                    boolean zH3 = c0912t3.h(xVar3);
                    Object objK3 = c0912t3.K();
                    if (zH3 || objK3 == C0903o.f11850a) {
                        objK3 = new d(xVar3, 13);
                        c0912t3.i0(objK3);
                    }
                    c0912t3.p(false);
                    g.f(false, strS3, null, true, (InterfaceC1180a) objK3, c0912t3, 3072, 5);
                }
                break;
            case 3:
                C0912t c0912t4 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t4.z()) {
                    c0912t4.Q();
                } else {
                    String strS4 = I0.c.S(R.string.settings_performance_lyric_title, c0912t4);
                    c0912t4.X(-1773328933);
                    y3.x xVar4 = this.f13525p;
                    boolean zH4 = c0912t4.h(xVar4);
                    Object objK4 = c0912t4.K();
                    W w7 = C0903o.f11850a;
                    if (zH4 || objK4 == w7) {
                        objK4 = new d(xVar4, 14);
                        c0912t4.i0(objK4);
                    }
                    c0912t4.p(false);
                    g.f(false, strS4, null, false, (InterfaceC1180a) objK4, c0912t4, 0, 13);
                    AbstractC1113a.j(null, c0912t4, 0);
                    String strS5 = I0.c.S(R.string.settings_performance_ui_title, c0912t4);
                    c0912t4.X(-1773320829);
                    boolean zH5 = c0912t4.h(xVar4);
                    Object objK5 = c0912t4.K();
                    if (zH5 || objK5 == w7) {
                        objK5 = new d(xVar4, 15);
                        c0912t4.i0(objK5);
                    }
                    c0912t4.p(false);
                    g.f(false, strS5, null, false, (InterfaceC1180a) objK5, c0912t4, 0, 13);
                    AbstractC1113a.j(null, c0912t4, 0);
                    String strS6 = I0.c.S(R.string.settings_performance_notification_title, c0912t4);
                    c0912t4.X(-1773312158);
                    boolean zH6 = c0912t4.h(xVar4);
                    Object objK6 = c0912t4.K();
                    if (zH6 || objK6 == w7) {
                        objK6 = new d(xVar4, 16);
                        c0912t4.i0(objK6);
                    }
                    c0912t4.p(false);
                    g.f(false, strS6, null, false, (InterfaceC1180a) objK6, c0912t4, 0, 13);
                }
                break;
            case 4:
                C0912t c0912t5 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t5.z()) {
                    c0912t5.Q();
                } else {
                    String strS7 = I0.c.S(R.string.settings_audio_exoplayer, c0912t5);
                    c0912t5.X(-1773299329);
                    y3.x xVar5 = this.f13525p;
                    boolean zH7 = c0912t5.h(xVar5);
                    Object objK7 = c0912t5.K();
                    if (zH7 || objK7 == C0903o.f11850a) {
                        objK7 = new d(xVar5, 17);
                        c0912t5.i0(objK7);
                    }
                    c0912t5.p(false);
                    g.f(false, strS7, null, false, (InterfaceC1180a) objK7, c0912t5, 0, 13);
                    AbstractC1113a.j(null, c0912t5, 0);
                    g.n(false, I0.c.S(R.string.settings_audio_fade_in_out, c0912t5), new C1048w(0), new C1048w(23), c0912t5, 27648);
                }
                break;
            case 5:
                C0912t c0912t6 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t6.z()) {
                    c0912t6.Q();
                } else {
                    String strS8 = I0.c.S(R.string.settings_extend_lyricgetterapi, c0912t6);
                    c0912t6.X(-1773228707);
                    y3.x xVar6 = this.f13525p;
                    boolean zH8 = c0912t6.h(xVar6);
                    Object objK8 = c0912t6.K();
                    W w8 = C0903o.f11850a;
                    if (zH8 || objK8 == w8) {
                        objK8 = new d(xVar6, 18);
                        c0912t6.i0(objK8);
                    }
                    c0912t6.p(false);
                    g.f(false, strS8, null, false, (InterfaceC1180a) objK8, c0912t6, 0, 13);
                    AbstractC1113a.j(null, c0912t6, 0);
                    String strS9 = I0.c.S(R.string.settings_extend_superlyricapi, c0912t6);
                    c0912t6.X(-1773220708);
                    boolean zH9 = c0912t6.h(xVar6);
                    Object objK9 = c0912t6.K();
                    if (zH9 || objK9 == w8) {
                        objK9 = new d(xVar6, 19);
                        c0912t6.i0(objK9);
                    }
                    c0912t6.p(false);
                    g.f(false, strS9, null, false, (InterfaceC1180a) objK9, c0912t6, 0, 13);
                    AbstractC1113a.j(null, c0912t6, 0);
                    String strS10 = I0.c.S(R.string.settings_extend_ticker_lyric, c0912t6);
                    c0912t6.X(-1773212774);
                    boolean zH10 = c0912t6.h(xVar6);
                    Object objK10 = c0912t6.K();
                    if (zH10 || objK10 == w8) {
                        objK10 = new d(xVar6, 20);
                        c0912t6.i0(objK10);
                    }
                    c0912t6.p(false);
                    g.f(false, strS10, null, false, (InterfaceC1180a) objK10, c0912t6, 0, 13);
                }
                break;
            case 6:
                C0912t c0912t7 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t7.z()) {
                    c0912t7.Q();
                } else {
                    String strS11 = I0.c.S(R.string.settings_others_opensource_license, c0912t7);
                    c0912t7.X(-1773197856);
                    y3.x xVar7 = this.f13525p;
                    boolean zH11 = c0912t7.h(xVar7);
                    Object objK11 = c0912t7.K();
                    W w9 = C0903o.f11850a;
                    if (zH11 || objK11 == w9) {
                        objK11 = new d(xVar7, 21);
                        c0912t7.i0(objK11);
                    }
                    c0912t7.p(false);
                    g.f(false, strS11, null, false, (InterfaceC1180a) objK11, c0912t7, 0, 13);
                    AbstractC1113a.j(null, c0912t7, 0);
                    String strS12 = I0.c.S(R.string.settings_others_about, c0912t7);
                    c0912t7.X(-1773184684);
                    boolean zH12 = c0912t7.h(xVar7);
                    Object objK12 = c0912t7.K();
                    if (zH12 || objK12 == w9) {
                        objK12 = new d(xVar7, 22);
                        c0912t7.i0(objK12);
                    }
                    c0912t7.p(false);
                    g.f(false, strS12, null, false, (InterfaceC1180a) objK12, c0912t7, 0, 13);
                }
                break;
            case 7:
                C0912t c0912t8 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t8.z()) {
                    c0912t8.Q();
                } else {
                    g.l(false, I0.c.S(R.string.settings_audio_exoplayer_decode_codec, c0912t8), Z4.o.e0("Auto", "FFmpeg", "System"), new b6.k(29), SettingsLibrary.INSTANCE.getCodec(), c0912t8, 224256);
                    AbstractC1113a.j(null, c0912t8, 0);
                    String strS13 = I0.c.S(R.string.settings_audio_exoplayer_support_mediacodec, c0912t8);
                    c0912t8.X(1511867757);
                    y3.x xVar8 = this.f13525p;
                    boolean zH13 = c0912t8.h(xVar8);
                    Object objK13 = c0912t8.K();
                    if (zH13 || objK13 == C0903o.f11850a) {
                        objK13 = new d(xVar8, 24);
                        c0912t8.i0(objK13);
                    }
                    c0912t8.p(false);
                    g.f(false, strS13, null, false, (InterfaceC1180a) objK13, c0912t8, 0, 13);
                    AbstractC1113a.j(null, c0912t8, 0);
                    g.n(false, I0.c.S(R.string.settings_audio_exoplayer_decode_hardware_audio_track_playback_params, c0912t8), new C1048w(29), new n6.c(0), c0912t8, 27648);
                }
                break;
            case 8:
                C0912t c0912t9 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t9.z()) {
                    c0912t9.Q();
                } else {
                    Y4.m mVarO = AbstractC0509a.O(new n6.c(3));
                    InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.f9203c, ((C0803s) c0912t9.j(AbstractC0805u.f11147a)).f11100f, AbstractC1959I.f20180a);
                    C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t9, 0);
                    long j3 = c0912t9.f11891T;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L = c0912t9.l();
                    InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t9, interfaceC1398pB);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i = C0354j.f6015b;
                    c0912t9.b0();
                    if (c0912t9.f11890S) {
                        c0912t9.k(c0353i);
                    } else {
                        c0912t9.l0();
                    }
                    C0879c.y(c0912t9, c0084zA, C0354j.f6019f);
                    C0879c.y(c0912t9, interfaceC0906p0L, C0354j.f6018e);
                    C0351h c0351h = C0354j.f6020g;
                    if (c0912t9.f11890S || !AbstractC1209k.a(c0912t9.K(), Integer.valueOf(i7))) {
                        n1.c.w(i7, c0912t9, i7, c0351h);
                    }
                    C0879c.y(c0912t9, interfaceC1398pC, C0354j.f6017d);
                    c0912t9.X(-1885818744);
                    Object objK14 = c0912t9.K();
                    W w10 = C0903o.f11850a;
                    if (objK14 == w10) {
                        objK14 = new C0888g0(6);
                        c0912t9.i0(objK14);
                    }
                    C0888g0 c0888g0 = (C0888g0) objK14;
                    c0912t9.p(false);
                    String strS14 = I0.c.S(R.string.settings_extend_lyricgetterapi, c0912t9);
                    c0912t9.X(-1885806669);
                    y3.x xVar9 = this.f13525p;
                    boolean zH14 = c0912t9.h(xVar9);
                    Object objK15 = c0912t9.K();
                    if (zH14 || objK15 == w10) {
                        objK15 = new d(xVar9, 26);
                        c0912t9.i0(objK15);
                    }
                    InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK15;
                    c0912t9.p(false);
                    c0912t9.X(-1885800158);
                    boolean zH15 = c0912t9.h(mVarO);
                    Object objK16 = c0912t9.K();
                    if (zH15 || objK16 == w10) {
                        objK16 = new h0(mVarO, 22, c0888g0);
                        c0912t9.i0(objK16);
                    }
                    c0912t9.p(false);
                    AbstractC1110d.h(strS14, null, true, interfaceC1180a, null, null, null, 0.0f, true, (InterfaceC1182c) objK16, c0912t9, 100663680, 242);
                    c0912t9.p(true);
                }
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                C0912t c0912t10 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t10.z()) {
                    c0912t10.Q();
                } else {
                    InterfaceC1398p interfaceC1398pB2 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.f9203c, ((C0803s) c0912t10.j(AbstractC0805u.f11147a)).f11100f, AbstractC1959I.f20180a);
                    C0084z c0084zA2 = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t10, 0);
                    long j7 = c0912t10.f11891T;
                    int i8 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t10.l();
                    InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t10, interfaceC1398pB2);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i2 = C0354j.f6015b;
                    c0912t10.b0();
                    if (c0912t10.f11890S) {
                        c0912t10.k(c0353i2);
                    } else {
                        c0912t10.l0();
                    }
                    C0879c.y(c0912t10, c0084zA2, C0354j.f6019f);
                    C0879c.y(c0912t10, interfaceC0906p0L2, C0354j.f6018e);
                    C0351h c0351h2 = C0354j.f6020g;
                    if (c0912t10.f11890S || !AbstractC1209k.a(c0912t10.K(), Integer.valueOf(i8))) {
                        n1.c.w(i8, c0912t10, i8, c0351h2);
                    }
                    C0879c.y(c0912t10, interfaceC1398pC2, C0354j.f6017d);
                    Context context = (Context) c0912t10.j(AndroidCompositionLocals_androidKt.f9324b);
                    c0912t10.X(1456077142);
                    Object objK17 = c0912t10.K();
                    W w11 = C0903o.f11850a;
                    if (objK17 == w11) {
                        C0888g0 c0888g02 = new C0888g0(SuperLyricTool.apiVersion);
                        c0912t10.i0(c0888g02);
                        objK17 = c0888g02;
                    }
                    C0888g0 c0888g03 = (C0888g0) objK17;
                    Object objR = n1.c.r(1456081294, c0912t10, false);
                    if (objR == w11) {
                        objR = C0879c.t(context.getPackageName());
                        c0912t10.i0(objR);
                    }
                    InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objR;
                    c0912t10.p(false);
                    String strS15 = I0.c.S(R.string.settings_extend_superlyricapi, c0912t10);
                    c0912t10.X(1456093399);
                    y3.x xVar10 = this.f13525p;
                    boolean zH16 = c0912t10.h(xVar10);
                    Object objK18 = c0912t10.K();
                    if (zH16 || objK18 == w11) {
                        objK18 = new d(xVar10, 27);
                        c0912t10.i0(objK18);
                    }
                    InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) objK18;
                    Object objR2 = n1.c.r(1456100121, c0912t10, false);
                    if (objR2 == w11) {
                        objR2 = new h0(interfaceC0878b0, 23, c0888g03);
                        c0912t10.i0(objR2);
                    }
                    c0912t10.p(false);
                    AbstractC1110d.h(strS15, null, true, interfaceC1180a2, null, null, null, 0.0f, true, (InterfaceC1182c) objR2, c0912t10, 905970048, 242);
                    c0912t10.p(true);
                }
                break;
            default:
                C0912t c0912t11 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t11.z()) {
                    c0912t11.Q();
                } else {
                    InterfaceC1398p interfaceC1398pB3 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.f9203c, ((C0803s) c0912t11.j(AbstractC0805u.f11147a)).f11100f, AbstractC1959I.f20180a);
                    C0084z c0084zA3 = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t11, 0);
                    long j8 = c0912t11.f11891T;
                    int i9 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L3 = c0912t11.l();
                    InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t11, interfaceC1398pB3);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i3 = C0354j.f6015b;
                    c0912t11.b0();
                    if (c0912t11.f11890S) {
                        c0912t11.k(c0353i3);
                    } else {
                        c0912t11.l0();
                    }
                    C0879c.y(c0912t11, c0084zA3, C0354j.f6019f);
                    C0879c.y(c0912t11, interfaceC0906p0L3, C0354j.f6018e);
                    C0351h c0351h3 = C0354j.f6020g;
                    if (c0912t11.f11890S || !AbstractC1209k.a(c0912t11.K(), Integer.valueOf(i9))) {
                        n1.c.w(i9, c0912t11, i9, c0351h3);
                    }
                    C0879c.y(c0912t11, interfaceC1398pC3, C0354j.f6017d);
                    Context context2 = (Context) c0912t11.j(AndroidCompositionLocals_androidKt.f9324b);
                    e.i iVarE = AbstractC1267a.E(new Y1.o(1), new C1247d(2), c0912t11, 48);
                    String strS16 = I0.c.S(R.string.settings_extend_ticker_lyric, c0912t11);
                    c0912t11.X(234490678);
                    y3.x xVar11 = this.f13525p;
                    boolean zH17 = c0912t11.h(xVar11);
                    Object objK19 = c0912t11.K();
                    W w12 = C0903o.f11850a;
                    if (zH17 || objK19 == w12) {
                        objK19 = new d(xVar11, 28);
                        c0912t11.i0(objK19);
                    }
                    InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) objK19;
                    c0912t11.p(false);
                    c0912t11.X(234495713);
                    boolean zF2 = c0912t11.f(context2) | c0912t11.h(iVarE);
                    Object objK20 = c0912t11.K();
                    if (zF2 || objK20 == w12) {
                        objK20 = new h0(context2, 24, iVarE);
                        c0912t11.i0(objK20);
                    }
                    c0912t11.p(false);
                    AbstractC1110d.h(strS16, null, true, interfaceC1180a3, null, null, null, 0.0f, true, (InterfaceC1182c) objK20, c0912t11, 100663680, 242);
                    c0912t11.p(true);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
