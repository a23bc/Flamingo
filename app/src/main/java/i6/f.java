package i6;

import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0084z;
import D.InterfaceC0077s;
import F.C0130c;
import M.C0265j;
import M.t0;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.W;
import j5.AbstractC1110d;
import java.util.ArrayList;
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
import v6.E;
import yos.music.player.R;
import yos.music.player.data.libraries.MusicLibrary;

/* JADX INFO: loaded from: classes.dex */
public final class f implements l5.f {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f13526o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ y3.x f13527p;

    public /* synthetic */ f(y3.x xVar, int i7) {
        this.f13526o = i7;
        this.f13527p = xVar;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f13526o) {
            case 0:
                C0912t c0912t = (C0912t) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC1209k.f((C0130c) obj, "$this$item");
                if ((iIntValue & 17) == 16 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
                    C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t, 0);
                    long j3 = c0912t.f11891T;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
                    InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, fillElement);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i = C0354j.f6015b;
                    c0912t.b0();
                    if (c0912t.f11890S) {
                        c0912t.k(c0353i);
                    } else {
                        c0912t.l0();
                    }
                    C0879c.y(c0912t, c0084zA, C0354j.f6019f);
                    C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
                    C0351h c0351h = C0354j.f6020g;
                    if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
                        n1.c.w(i7, c0912t, i7, c0351h);
                    }
                    C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
                    D0.b bVarB = AbstractC1267a.B(R.drawable.ic_library_link_icon_playlists, c0912t);
                    String strS = I0.c.S(R.string.page_library_playlists, c0912t);
                    c0912t.X(-1490296093);
                    y3.x xVar = this.f13527p;
                    boolean zH = c0912t.h(xVar);
                    Object objK = c0912t.K();
                    W w7 = C0903o.f11850a;
                    if (zH || objK == w7) {
                        objK = new d(xVar, 0);
                        c0912t.i0(objK);
                    }
                    c0912t.p(false);
                    android.support.v4.media.session.b.a(bVarB, strS, (InterfaceC1180a) objK, c0912t, 0);
                    AbstractC1267a.d(null, c0912t, 0);
                    D0.b bVarB2 = AbstractC1267a.B(R.drawable.ic_library_link_icon_artists, c0912t);
                    String strS2 = I0.c.S(R.string.page_library_artists, c0912t);
                    c0912t.X(-1490283034);
                    boolean zH2 = c0912t.h(xVar);
                    Object objK2 = c0912t.K();
                    if (zH2 || objK2 == w7) {
                        objK2 = new d(xVar, 1);
                        c0912t.i0(objK2);
                    }
                    c0912t.p(false);
                    android.support.v4.media.session.b.a(bVarB2, strS2, (InterfaceC1180a) objK2, c0912t, 0);
                    AbstractC1267a.d(null, c0912t, 0);
                    D0.b bVarB3 = AbstractC1267a.B(R.drawable.ic_library_link_icon_album, c0912t);
                    String strS3 = I0.c.S(R.string.page_library_albums, c0912t);
                    c0912t.X(-1490269979);
                    boolean zH3 = c0912t.h(xVar);
                    Object objK3 = c0912t.K();
                    if (zH3 || objK3 == w7) {
                        objK3 = new d(xVar, 2);
                        c0912t.i0(objK3);
                    }
                    c0912t.p(false);
                    android.support.v4.media.session.b.a(bVarB3, strS3, (InterfaceC1180a) objK3, c0912t, 0);
                    AbstractC1267a.d(null, c0912t, 0);
                    AbstractC1110d.n(n0.e.e(-1282115147, new e(xVar, 0), c0912t), c0912t, 6);
                    AbstractC1267a.d(null, c0912t, 0);
                    c0912t.p(true);
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC1209k.f((C0130c) obj, "$this$item");
                if ((iIntValue2 & 17) == 16 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    FillElement fillElement2 = androidx.compose.foundation.layout.c.f9203c;
                    C0084z c0084zA2 = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t2, 0);
                    long j7 = c0912t2.f11891T;
                    int i8 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L2 = c0912t2.l();
                    InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t2, fillElement2);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i2 = C0354j.f6015b;
                    c0912t2.b0();
                    if (c0912t2.f11890S) {
                        c0912t2.k(c0353i2);
                    } else {
                        c0912t2.l0();
                    }
                    C0879c.y(c0912t2, c0084zA2, C0354j.f6019f);
                    C0879c.y(c0912t2, interfaceC0906p0L2, C0354j.f6018e);
                    C0351h c0351h2 = C0354j.f6020g;
                    if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i8))) {
                        n1.c.w(i8, c0912t2, i8, c0351h2);
                    }
                    C0879c.y(c0912t2, interfaceC1398pC2, C0354j.f6017d);
                    y3.x xVar2 = this.f13527p;
                    E.a(null, null, 0L, n0.e.e(1385733194, new e(xVar2, 1), c0912t2), c0912t2, 3072, 7);
                    AbstractC1113a.m(null, c0912t2, 0);
                    E.a(null, null, 0L, n0.e.e(-337111743, new e(xVar2, 2), c0912t2), c0912t2, 3072, 7);
                    h.b(I0.c.S(R.string.settings_library_refresh_now_desc, c0912t2), c0912t2, 0);
                    AbstractC1113a.l(null, c0912t2, 0);
                    h.b(I0.c.S(R.string.settings_performance, c0912t2), c0912t2, 0);
                    E.a(null, null, 0L, n0.e.e(-421921214, new e(xVar2, 3), c0912t2), c0912t2, 3072, 7);
                    AbstractC1113a.l(null, c0912t2, 0);
                    h.b(I0.c.S(R.string.settings_audio, c0912t2), c0912t2, 0);
                    E.a(null, null, 0L, n0.e.e(-506730685, new e(xVar2, 4), c0912t2), c0912t2, 3072, 7);
                    h.b(I0.c.S(R.string.settings_audio_fade_in_out_desc, c0912t2), c0912t2, 0);
                    AbstractC1113a.l(null, c0912t2, 0);
                    h.b(I0.c.S(R.string.settings_play, c0912t2), c0912t2, 0);
                    E.a(null, null, 0L, m6.b.f14442a, c0912t2, 3072, 7);
                    h.b(I0.c.S(R.string.settings_play_history_desc, c0912t2), c0912t2, 0);
                    AbstractC1113a.l(null, c0912t2, 0);
                    h.b(I0.c.S(R.string.settings_extend, c0912t2), c0912t2, 0);
                    E.a(null, null, 0L, n0.e.e(-676349627, new e(xVar2, 5), c0912t2), c0912t2, 3072, 7);
                    AbstractC1113a.l(null, c0912t2, 0);
                    h.b(I0.c.S(R.string.settings_others, c0912t2), c0912t2, 0);
                    E.a(null, null, 0L, n0.e.e(-761159098, new e(xVar2, 6), c0912t2), c0912t2, 3072, 7);
                    c0912t2.p(true);
                }
                break;
            case 2:
                C0912t c0912t3 = (C0912t) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC1209k.f((C0130c) obj, "$this$item");
                if ((iIntValue3 & 17) == 16 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    FillElement fillElement3 = androidx.compose.foundation.layout.c.f9203c;
                    C0084z c0084zA3 = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t3, 0);
                    long j8 = c0912t3.f11891T;
                    int i9 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC0906p0 interfaceC0906p0L3 = c0912t3.l();
                    InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t3, fillElement3);
                    InterfaceC0355k.f6047i.getClass();
                    C0353i c0353i3 = C0354j.f6015b;
                    c0912t3.b0();
                    if (c0912t3.f11890S) {
                        c0912t3.k(c0353i3);
                    } else {
                        c0912t3.l0();
                    }
                    C0879c.y(c0912t3, c0084zA3, C0354j.f6019f);
                    C0879c.y(c0912t3, interfaceC0906p0L3, C0354j.f6018e);
                    C0351h c0351h3 = C0354j.f6020g;
                    if (c0912t3.f11890S || !AbstractC1209k.a(c0912t3.K(), Integer.valueOf(i9))) {
                        n1.c.w(i9, c0912t3, i9, c0351h3);
                    }
                    C0879c.y(c0912t3, interfaceC1398pC3, C0354j.f6017d);
                    h.b(I0.c.S(R.string.settings_audio_exoplayer_behaviors, c0912t3), c0912t3, 0);
                    E.a(null, null, 0L, n6.b.f14556a, c0912t3, 3072, 7);
                    h.b(I0.c.S(R.string.settings_audio_exoplayer_behaviors_audio_attributes_desc, c0912t3), c0912t3, 0);
                    AbstractC1113a.l(null, c0912t3, 0);
                    h.b(I0.c.S(R.string.settings_audio_exoplayer_decode, c0912t3), c0912t3, 0);
                    E.a(null, null, 0L, n0.e.e(-899801057, new e(this.f13527p, 7), c0912t3), c0912t3, 3072, 7);
                    AbstractC1113a.m(null, c0912t3, 0);
                    E.a(null, null, 0L, n6.b.f14557b, c0912t3, 3072, 7);
                    h.b(I0.c.S(R.string.settings_audio_exoplayer_decode_audio_float_output_desc, c0912t3), c0912t3, 0);
                    AbstractC1113a.l(null, c0912t3, 0);
                    c0912t3.p(true);
                }
                break;
            case 3:
                C0912t c0912t4 = (C0912t) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC0077s) obj, "$this$SettingBackground");
                if ((iIntValue4 & 17) == 16 && c0912t4.z()) {
                    c0912t4.Q();
                } else {
                    String strS4 = I0.c.S(R.string.settings_audio_exoplayer, c0912t4);
                    String strS5 = I0.c.S(R.string.settings_audio_exoplayer_sub, c0912t4);
                    c0912t4.X(-1504486657);
                    y3.x xVar3 = this.f13527p;
                    boolean zH4 = c0912t4.h(xVar3);
                    Object objK4 = c0912t4.K();
                    W w8 = C0903o.f11850a;
                    if (zH4 || objK4 == w8) {
                        objK4 = new d(xVar3, 23);
                        c0912t4.i0(objK4);
                    }
                    InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK4;
                    c0912t4.p(false);
                    c0912t4.X(-1504480357);
                    boolean zH5 = c0912t4.h(xVar3);
                    Object objK5 = c0912t4.K();
                    if (zH5 || objK5 == w8) {
                        objK5 = new b(xVar3, 2);
                        c0912t4.i0(objK5);
                    }
                    c0912t4.p(false);
                    AbstractC1110d.h(strS4, strS5, true, interfaceC1180a, null, null, null, 0.0f, true, (InterfaceC1182c) objK5, c0912t4, 100663680, 240);
                }
                break;
            case 4:
                C0912t c0912t5 = (C0912t) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC0077s) obj, "$this$SettingBackground");
                if ((iIntValue5 & 17) == 16 && c0912t5.z()) {
                    c0912t5.Q();
                } else {
                    c0912t5.X(-2128007644);
                    Object objK6 = c0912t5.K();
                    W w9 = C0903o.f11850a;
                    if (objK6 == w9) {
                        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
                        AbstractC1209k.e(codecInfos, "getCodecInfos(...)");
                        ArrayList arrayList = new ArrayList();
                        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                            if (!mediaCodecInfo.isEncoder()) {
                                arrayList.add(mediaCodecInfo);
                            }
                        }
                        objK6 = C0879c.t(arrayList);
                        c0912t5.i0(objK6);
                    }
                    InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK6;
                    c0912t5.p(false);
                    String strS6 = I0.c.S(R.string.settings_audio_exoplayer_support_mediacodec, c0912t5);
                    c0912t5.X(-2127997367);
                    y3.x xVar4 = this.f13527p;
                    boolean zH6 = c0912t5.h(xVar4);
                    Object objK7 = c0912t5.K();
                    if (zH6 || objK7 == w9) {
                        objK7 = new d(xVar4, 25);
                        c0912t5.i0(objK7);
                    }
                    InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) objK7;
                    Object objR = n1.c.r(-2127993939, c0912t5, false);
                    if (objR == w9) {
                        objR = new t0(interfaceC0878b0, 21);
                        c0912t5.i0(objR);
                    }
                    c0912t5.p(false);
                    AbstractC1110d.h(strS6, null, true, interfaceC1180a2, null, null, null, 0.0f, true, (InterfaceC1182c) objR, c0912t5, 905970048, 242);
                }
                break;
            case 5:
                C0912t c0912t6 = (C0912t) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC0077s) obj, "$this$SettingBackground");
                if ((iIntValue6 & 17) == 16 && c0912t6.z()) {
                    c0912t6.Q();
                } else {
                    List listG0 = Z4.n.G0(MusicLibrary.INSTANCE.getFolders(), new p6.i());
                    Context context = (Context) c0912t6.j(AndroidCompositionLocals_androidKt.f9324b);
                    Y1.o oVar = new Y1.o(2);
                    c0912t6.X(904715356);
                    boolean zF = c0912t6.f(context);
                    Object objK8 = c0912t6.K();
                    W w10 = C0903o.f11850a;
                    if (zF || objK8 == w10) {
                        objK8 = new p6.f(1, context);
                        c0912t6.i0(objK8);
                    }
                    c0912t6.p(false);
                    e.i iVarE = AbstractC1267a.E(oVar, (InterfaceC1182c) objK8, c0912t6, 0);
                    String strS7 = I0.c.S(R.string.settings_library_overview, c0912t6);
                    c0912t6.X(904732481);
                    y3.x xVar5 = this.f13527p;
                    boolean zH7 = c0912t6.h(xVar5);
                    Object objK9 = c0912t6.K();
                    if (zH7 || objK9 == w10) {
                        objK9 = new p6.h(xVar5, 0);
                        c0912t6.i0(objK9);
                    }
                    InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) objK9;
                    c0912t6.p(false);
                    c0912t6.X(904736588);
                    boolean zF2 = c0912t6.f(listG0) | c0912t6.h(iVarE) | c0912t6.h(xVar5);
                    Object objK10 = c0912t6.K();
                    if (zF2 || objK10 == w10) {
                        objK10 = new C0265j(listG0, iVarE, xVar5, 14);
                        c0912t6.i0(objK10);
                    }
                    c0912t6.p(false);
                    AbstractC1110d.h(strS7, null, true, interfaceC1180a3, null, null, null, 0.0f, true, (InterfaceC1182c) objK10, c0912t6, 100663680, 242);
                }
                break;
            case 6:
                C0912t c0912t7 = (C0912t) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC0077s) obj, "$this$SettingBackground");
                if ((iIntValue7 & 17) == 16 && c0912t7.z()) {
                    c0912t7.Q();
                } else {
                    String strS8 = I0.c.S(R.string.settings_others_about, c0912t7);
                    c0912t7.X(-1803830352);
                    y3.x xVar6 = this.f13527p;
                    boolean zH8 = c0912t7.h(xVar6);
                    Object objK11 = c0912t7.K();
                    if (zH8 || objK11 == C0903o.f11850a) {
                        objK11 = new p6.h(xVar6, 1);
                        c0912t7.i0(objK11);
                    }
                    c0912t7.p(false);
                    AbstractC1110d.h(strS8, null, true, (InterfaceC1180a) objK11, null, null, null, 0.0f, true, new C1247d(5), c0912t7, 905970048, 242);
                }
                break;
            case 7:
                C0912t c0912t8 = (C0912t) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC0077s) obj, "$this$SettingBackground");
                if ((iIntValue8 & 17) == 16 && c0912t8.z()) {
                    c0912t8.Q();
                } else {
                    String strS9 = I0.c.S(R.string.settings_performance_lyric_title, c0912t8);
                    c0912t8.X(-490369571);
                    y3.x xVar7 = this.f13527p;
                    boolean zH9 = c0912t8.h(xVar7);
                    Object objK12 = c0912t8.K();
                    if (zH9 || objK12 == C0903o.f11850a) {
                        objK12 = new p6.h(xVar7, 3);
                        c0912t8.i0(objK12);
                    }
                    c0912t8.p(false);
                    AbstractC1110d.h(strS9, null, true, (InterfaceC1180a) objK12, null, null, null, 0.0f, true, new C1247d(7), c0912t8, 905970048, 242);
                }
                break;
            case 8:
                C0912t c0912t9 = (C0912t) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC0077s) obj, "$this$SettingBackground");
                if ((iIntValue9 & 17) == 16 && c0912t9.z()) {
                    c0912t9.Q();
                } else {
                    String strS10 = I0.c.S(R.string.settings_performance_notification_title, c0912t9);
                    c0912t9.X(-696367473);
                    y3.x xVar8 = this.f13527p;
                    boolean zH10 = c0912t9.h(xVar8);
                    Object objK13 = c0912t9.K();
                    if (zH10 || objK13 == C0903o.f11850a) {
                        objK13 = new p6.h(xVar8, 4);
                        c0912t9.i0(objK13);
                    }
                    c0912t9.p(false);
                    AbstractC1110d.h(strS10, null, true, (InterfaceC1180a) objK13, null, null, null, 0.0f, true, new C1247d(8), c0912t9, 905970048, 242);
                }
                break;
            default:
                C0912t c0912t10 = (C0912t) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                AbstractC1209k.f((InterfaceC0077s) obj, "$this$SettingBackground");
                if ((iIntValue10 & 17) == 16 && c0912t10.z()) {
                    c0912t10.Q();
                } else {
                    String strS11 = I0.c.S(R.string.settings_performance_ui_title, c0912t10);
                    c0912t10.X(1600329934);
                    y3.x xVar9 = this.f13527p;
                    boolean zH11 = c0912t10.h(xVar9);
                    Object objK14 = c0912t10.K();
                    if (zH11 || objK14 == C0903o.f11850a) {
                        objK14 = new p6.h(xVar9, 5);
                        c0912t10.i0(objK14);
                    }
                    c0912t10.p(false);
                    AbstractC1110d.h(strS11, null, true, (InterfaceC1180a) objK14, null, null, null, 0.0f, true, new C1247d(10), c0912t10, 905970048, 242);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
