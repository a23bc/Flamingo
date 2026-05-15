package yos.music.player;

import B2.e;
import H2.C0196m;
import K4.l;
import N4.r;
import V1.a;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.tencent.mmkv.MMKV;
import d.C0746L;
import i6.g;
import java.lang.Thread;
import java.util.Map;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1223y;
import w2.t;
import w3.B1;
import w3.C1760y;
import w3.C1762z;
import w3.RunnableC1754v;
import w4.b;
import y2.j;
import yos.music.player.CrashActivity;
import yos.music.player.YosBasicApplication;
import yos.music.player.data.libraries.Folder;
import yos.music.player.data.libraries.PlayList;
import yos.music.player.data.libraries.YosMediaItem;
import yos.music.player.data.libraries.YosStringWrapper;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class YosBasicApplication extends Application {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f20577o = 0;

    @Override // android.app.Application
    public final void onCreate() {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: U5.a0
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                int i7 = YosBasicApplication.f20577o;
                YosBasicApplication yosBasicApplication = this.f7217a;
                th.printStackTrace();
                int i8 = CrashActivity.f20572H;
                String strR = N5.l.R(th);
                Intent intent = new Intent(yosBasicApplication, (Class<?>) CrashActivity.class);
                intent.addFlags(268468224);
                intent.putExtra("CRASH_INFO_KEY", strR);
                yosBasicApplication.startActivity(intent);
                Process.killProcess(Process.myPid());
                System.exit(1);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        });
        g.f13528a = false;
        MMKV.o(this);
        l lVar = new l();
        lVar.b(new r(1));
        final C0196m c0196mA = lVar.a();
        final int i7 = 3;
        InterfaceC1182c interfaceC1182c = new InterfaceC1182c() { // from class: U5.b0
            @Override // l5.InterfaceC1182c
            public final Object b(Object obj) {
                C0196m c0196m = c0196mA;
                switch (i7) {
                    case 0:
                        String str = (String) obj;
                        int i8 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str, "str");
                        return (YosMediaItem) c0196m.b(YosMediaItem.class, str);
                    case 1:
                        int i9 = YosBasicApplication.f20577o;
                        String strH = c0196m.h((YosStringWrapper) obj);
                        AbstractC1209k.e(strH, "toJson(...)");
                        return strH;
                    case 2:
                        String str2 = (String) obj;
                        int i10 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str2, "str");
                        return (YosStringWrapper) c0196m.b(YosStringWrapper.class, str2);
                    case 3:
                        int i11 = YosBasicApplication.f20577o;
                        String strH2 = c0196m.h((Folder) obj);
                        AbstractC1209k.e(strH2, "toJson(...)");
                        return strH2;
                    case 4:
                        String str3 = (String) obj;
                        int i12 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str3, "str");
                        return (Folder) c0196m.b(Folder.class, str3);
                    case 5:
                        int i13 = YosBasicApplication.f20577o;
                        String strH3 = c0196m.h((PlayList) obj);
                        AbstractC1209k.e(strH3, "toJson(...)");
                        return strH3;
                    case 6:
                        String str4 = (String) obj;
                        int i14 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str4, "str");
                        return (PlayList) c0196m.b(PlayList.class, str4);
                    case 7:
                        int i15 = YosBasicApplication.f20577o;
                        String strH4 = c0196m.h((int[]) obj);
                        AbstractC1209k.e(strH4, "toJson(...)");
                        return strH4;
                    case 8:
                        String str5 = (String) obj;
                        int i16 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str5, "str");
                        return (int[]) c0196m.b(int[].class, str5);
                    default:
                        int i17 = YosBasicApplication.f20577o;
                        String strH5 = c0196m.h((YosMediaItem) obj);
                        AbstractC1209k.e(strH5, "toJson(...)");
                        return strH5;
                }
            }
        };
        final int i8 = 4;
        InterfaceC1182c interfaceC1182c2 = new InterfaceC1182c() { // from class: U5.b0
            @Override // l5.InterfaceC1182c
            public final Object b(Object obj) {
                C0196m c0196m = c0196mA;
                switch (i8) {
                    case 0:
                        String str = (String) obj;
                        int i82 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str, "str");
                        return (YosMediaItem) c0196m.b(YosMediaItem.class, str);
                    case 1:
                        int i9 = YosBasicApplication.f20577o;
                        String strH = c0196m.h((YosStringWrapper) obj);
                        AbstractC1209k.e(strH, "toJson(...)");
                        return strH;
                    case 2:
                        String str2 = (String) obj;
                        int i10 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str2, "str");
                        return (YosStringWrapper) c0196m.b(YosStringWrapper.class, str2);
                    case 3:
                        int i11 = YosBasicApplication.f20577o;
                        String strH2 = c0196m.h((Folder) obj);
                        AbstractC1209k.e(strH2, "toJson(...)");
                        return strH2;
                    case 4:
                        String str3 = (String) obj;
                        int i12 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str3, "str");
                        return (Folder) c0196m.b(Folder.class, str3);
                    case 5:
                        int i13 = YosBasicApplication.f20577o;
                        String strH3 = c0196m.h((PlayList) obj);
                        AbstractC1209k.e(strH3, "toJson(...)");
                        return strH3;
                    case 6:
                        String str4 = (String) obj;
                        int i14 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str4, "str");
                        return (PlayList) c0196m.b(PlayList.class, str4);
                    case 7:
                        int i15 = YosBasicApplication.f20577o;
                        String strH4 = c0196m.h((int[]) obj);
                        AbstractC1209k.e(strH4, "toJson(...)");
                        return strH4;
                    case 8:
                        String str5 = (String) obj;
                        int i16 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str5, "str");
                        return (int[]) c0196m.b(int[].class, str5);
                    default:
                        int i17 = YosBasicApplication.f20577o;
                        String strH5 = c0196m.h((YosMediaItem) obj);
                        AbstractC1209k.e(strH5, "toJson(...)");
                        return strH5;
                }
            }
        };
        Map mapD = b.d();
        AbstractC1223y.c(1, interfaceC1182c);
        mapD.put(Folder.class, interfaceC1182c);
        b.c().put(Folder.class, interfaceC1182c2);
        final int i9 = 5;
        InterfaceC1182c interfaceC1182c3 = new InterfaceC1182c() { // from class: U5.b0
            @Override // l5.InterfaceC1182c
            public final Object b(Object obj) {
                C0196m c0196m = c0196mA;
                switch (i9) {
                    case 0:
                        String str = (String) obj;
                        int i82 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str, "str");
                        return (YosMediaItem) c0196m.b(YosMediaItem.class, str);
                    case 1:
                        int i92 = YosBasicApplication.f20577o;
                        String strH = c0196m.h((YosStringWrapper) obj);
                        AbstractC1209k.e(strH, "toJson(...)");
                        return strH;
                    case 2:
                        String str2 = (String) obj;
                        int i10 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str2, "str");
                        return (YosStringWrapper) c0196m.b(YosStringWrapper.class, str2);
                    case 3:
                        int i11 = YosBasicApplication.f20577o;
                        String strH2 = c0196m.h((Folder) obj);
                        AbstractC1209k.e(strH2, "toJson(...)");
                        return strH2;
                    case 4:
                        String str3 = (String) obj;
                        int i12 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str3, "str");
                        return (Folder) c0196m.b(Folder.class, str3);
                    case 5:
                        int i13 = YosBasicApplication.f20577o;
                        String strH3 = c0196m.h((PlayList) obj);
                        AbstractC1209k.e(strH3, "toJson(...)");
                        return strH3;
                    case 6:
                        String str4 = (String) obj;
                        int i14 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str4, "str");
                        return (PlayList) c0196m.b(PlayList.class, str4);
                    case 7:
                        int i15 = YosBasicApplication.f20577o;
                        String strH4 = c0196m.h((int[]) obj);
                        AbstractC1209k.e(strH4, "toJson(...)");
                        return strH4;
                    case 8:
                        String str5 = (String) obj;
                        int i16 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str5, "str");
                        return (int[]) c0196m.b(int[].class, str5);
                    default:
                        int i17 = YosBasicApplication.f20577o;
                        String strH5 = c0196m.h((YosMediaItem) obj);
                        AbstractC1209k.e(strH5, "toJson(...)");
                        return strH5;
                }
            }
        };
        final int i10 = 6;
        InterfaceC1182c interfaceC1182c4 = new InterfaceC1182c() { // from class: U5.b0
            @Override // l5.InterfaceC1182c
            public final Object b(Object obj) {
                C0196m c0196m = c0196mA;
                switch (i10) {
                    case 0:
                        String str = (String) obj;
                        int i82 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str, "str");
                        return (YosMediaItem) c0196m.b(YosMediaItem.class, str);
                    case 1:
                        int i92 = YosBasicApplication.f20577o;
                        String strH = c0196m.h((YosStringWrapper) obj);
                        AbstractC1209k.e(strH, "toJson(...)");
                        return strH;
                    case 2:
                        String str2 = (String) obj;
                        int i102 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str2, "str");
                        return (YosStringWrapper) c0196m.b(YosStringWrapper.class, str2);
                    case 3:
                        int i11 = YosBasicApplication.f20577o;
                        String strH2 = c0196m.h((Folder) obj);
                        AbstractC1209k.e(strH2, "toJson(...)");
                        return strH2;
                    case 4:
                        String str3 = (String) obj;
                        int i12 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str3, "str");
                        return (Folder) c0196m.b(Folder.class, str3);
                    case 5:
                        int i13 = YosBasicApplication.f20577o;
                        String strH3 = c0196m.h((PlayList) obj);
                        AbstractC1209k.e(strH3, "toJson(...)");
                        return strH3;
                    case 6:
                        String str4 = (String) obj;
                        int i14 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str4, "str");
                        return (PlayList) c0196m.b(PlayList.class, str4);
                    case 7:
                        int i15 = YosBasicApplication.f20577o;
                        String strH4 = c0196m.h((int[]) obj);
                        AbstractC1209k.e(strH4, "toJson(...)");
                        return strH4;
                    case 8:
                        String str5 = (String) obj;
                        int i16 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str5, "str");
                        return (int[]) c0196m.b(int[].class, str5);
                    default:
                        int i17 = YosBasicApplication.f20577o;
                        String strH5 = c0196m.h((YosMediaItem) obj);
                        AbstractC1209k.e(strH5, "toJson(...)");
                        return strH5;
                }
            }
        };
        Map mapD2 = b.d();
        AbstractC1223y.c(1, interfaceC1182c3);
        mapD2.put(PlayList.class, interfaceC1182c3);
        b.c().put(PlayList.class, interfaceC1182c4);
        final int i11 = 7;
        InterfaceC1182c interfaceC1182c5 = new InterfaceC1182c() { // from class: U5.b0
            @Override // l5.InterfaceC1182c
            public final Object b(Object obj) {
                C0196m c0196m = c0196mA;
                switch (i11) {
                    case 0:
                        String str = (String) obj;
                        int i82 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str, "str");
                        return (YosMediaItem) c0196m.b(YosMediaItem.class, str);
                    case 1:
                        int i92 = YosBasicApplication.f20577o;
                        String strH = c0196m.h((YosStringWrapper) obj);
                        AbstractC1209k.e(strH, "toJson(...)");
                        return strH;
                    case 2:
                        String str2 = (String) obj;
                        int i102 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str2, "str");
                        return (YosStringWrapper) c0196m.b(YosStringWrapper.class, str2);
                    case 3:
                        int i112 = YosBasicApplication.f20577o;
                        String strH2 = c0196m.h((Folder) obj);
                        AbstractC1209k.e(strH2, "toJson(...)");
                        return strH2;
                    case 4:
                        String str3 = (String) obj;
                        int i12 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str3, "str");
                        return (Folder) c0196m.b(Folder.class, str3);
                    case 5:
                        int i13 = YosBasicApplication.f20577o;
                        String strH3 = c0196m.h((PlayList) obj);
                        AbstractC1209k.e(strH3, "toJson(...)");
                        return strH3;
                    case 6:
                        String str4 = (String) obj;
                        int i14 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str4, "str");
                        return (PlayList) c0196m.b(PlayList.class, str4);
                    case 7:
                        int i15 = YosBasicApplication.f20577o;
                        String strH4 = c0196m.h((int[]) obj);
                        AbstractC1209k.e(strH4, "toJson(...)");
                        return strH4;
                    case 8:
                        String str5 = (String) obj;
                        int i16 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str5, "str");
                        return (int[]) c0196m.b(int[].class, str5);
                    default:
                        int i17 = YosBasicApplication.f20577o;
                        String strH5 = c0196m.h((YosMediaItem) obj);
                        AbstractC1209k.e(strH5, "toJson(...)");
                        return strH5;
                }
            }
        };
        final int i12 = 8;
        InterfaceC1182c interfaceC1182c6 = new InterfaceC1182c() { // from class: U5.b0
            @Override // l5.InterfaceC1182c
            public final Object b(Object obj) {
                C0196m c0196m = c0196mA;
                switch (i12) {
                    case 0:
                        String str = (String) obj;
                        int i82 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str, "str");
                        return (YosMediaItem) c0196m.b(YosMediaItem.class, str);
                    case 1:
                        int i92 = YosBasicApplication.f20577o;
                        String strH = c0196m.h((YosStringWrapper) obj);
                        AbstractC1209k.e(strH, "toJson(...)");
                        return strH;
                    case 2:
                        String str2 = (String) obj;
                        int i102 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str2, "str");
                        return (YosStringWrapper) c0196m.b(YosStringWrapper.class, str2);
                    case 3:
                        int i112 = YosBasicApplication.f20577o;
                        String strH2 = c0196m.h((Folder) obj);
                        AbstractC1209k.e(strH2, "toJson(...)");
                        return strH2;
                    case 4:
                        String str3 = (String) obj;
                        int i122 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str3, "str");
                        return (Folder) c0196m.b(Folder.class, str3);
                    case 5:
                        int i13 = YosBasicApplication.f20577o;
                        String strH3 = c0196m.h((PlayList) obj);
                        AbstractC1209k.e(strH3, "toJson(...)");
                        return strH3;
                    case 6:
                        String str4 = (String) obj;
                        int i14 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str4, "str");
                        return (PlayList) c0196m.b(PlayList.class, str4);
                    case 7:
                        int i15 = YosBasicApplication.f20577o;
                        String strH4 = c0196m.h((int[]) obj);
                        AbstractC1209k.e(strH4, "toJson(...)");
                        return strH4;
                    case 8:
                        String str5 = (String) obj;
                        int i16 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str5, "str");
                        return (int[]) c0196m.b(int[].class, str5);
                    default:
                        int i17 = YosBasicApplication.f20577o;
                        String strH5 = c0196m.h((YosMediaItem) obj);
                        AbstractC1209k.e(strH5, "toJson(...)");
                        return strH5;
                }
            }
        };
        Map mapD3 = b.d();
        AbstractC1223y.c(1, interfaceC1182c5);
        mapD3.put(int[].class, interfaceC1182c5);
        b.c().put(int[].class, interfaceC1182c6);
        final int i13 = 9;
        InterfaceC1182c interfaceC1182c7 = new InterfaceC1182c() { // from class: U5.b0
            @Override // l5.InterfaceC1182c
            public final Object b(Object obj) {
                C0196m c0196m = c0196mA;
                switch (i13) {
                    case 0:
                        String str = (String) obj;
                        int i82 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str, "str");
                        return (YosMediaItem) c0196m.b(YosMediaItem.class, str);
                    case 1:
                        int i92 = YosBasicApplication.f20577o;
                        String strH = c0196m.h((YosStringWrapper) obj);
                        AbstractC1209k.e(strH, "toJson(...)");
                        return strH;
                    case 2:
                        String str2 = (String) obj;
                        int i102 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str2, "str");
                        return (YosStringWrapper) c0196m.b(YosStringWrapper.class, str2);
                    case 3:
                        int i112 = YosBasicApplication.f20577o;
                        String strH2 = c0196m.h((Folder) obj);
                        AbstractC1209k.e(strH2, "toJson(...)");
                        return strH2;
                    case 4:
                        String str3 = (String) obj;
                        int i122 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str3, "str");
                        return (Folder) c0196m.b(Folder.class, str3);
                    case 5:
                        int i132 = YosBasicApplication.f20577o;
                        String strH3 = c0196m.h((PlayList) obj);
                        AbstractC1209k.e(strH3, "toJson(...)");
                        return strH3;
                    case 6:
                        String str4 = (String) obj;
                        int i14 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str4, "str");
                        return (PlayList) c0196m.b(PlayList.class, str4);
                    case 7:
                        int i15 = YosBasicApplication.f20577o;
                        String strH4 = c0196m.h((int[]) obj);
                        AbstractC1209k.e(strH4, "toJson(...)");
                        return strH4;
                    case 8:
                        String str5 = (String) obj;
                        int i16 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str5, "str");
                        return (int[]) c0196m.b(int[].class, str5);
                    default:
                        int i17 = YosBasicApplication.f20577o;
                        String strH5 = c0196m.h((YosMediaItem) obj);
                        AbstractC1209k.e(strH5, "toJson(...)");
                        return strH5;
                }
            }
        };
        final int i14 = 0;
        InterfaceC1182c interfaceC1182c8 = new InterfaceC1182c() { // from class: U5.b0
            @Override // l5.InterfaceC1182c
            public final Object b(Object obj) {
                C0196m c0196m = c0196mA;
                switch (i14) {
                    case 0:
                        String str = (String) obj;
                        int i82 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str, "str");
                        return (YosMediaItem) c0196m.b(YosMediaItem.class, str);
                    case 1:
                        int i92 = YosBasicApplication.f20577o;
                        String strH = c0196m.h((YosStringWrapper) obj);
                        AbstractC1209k.e(strH, "toJson(...)");
                        return strH;
                    case 2:
                        String str2 = (String) obj;
                        int i102 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str2, "str");
                        return (YosStringWrapper) c0196m.b(YosStringWrapper.class, str2);
                    case 3:
                        int i112 = YosBasicApplication.f20577o;
                        String strH2 = c0196m.h((Folder) obj);
                        AbstractC1209k.e(strH2, "toJson(...)");
                        return strH2;
                    case 4:
                        String str3 = (String) obj;
                        int i122 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str3, "str");
                        return (Folder) c0196m.b(Folder.class, str3);
                    case 5:
                        int i132 = YosBasicApplication.f20577o;
                        String strH3 = c0196m.h((PlayList) obj);
                        AbstractC1209k.e(strH3, "toJson(...)");
                        return strH3;
                    case 6:
                        String str4 = (String) obj;
                        int i142 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str4, "str");
                        return (PlayList) c0196m.b(PlayList.class, str4);
                    case 7:
                        int i15 = YosBasicApplication.f20577o;
                        String strH4 = c0196m.h((int[]) obj);
                        AbstractC1209k.e(strH4, "toJson(...)");
                        return strH4;
                    case 8:
                        String str5 = (String) obj;
                        int i16 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str5, "str");
                        return (int[]) c0196m.b(int[].class, str5);
                    default:
                        int i17 = YosBasicApplication.f20577o;
                        String strH5 = c0196m.h((YosMediaItem) obj);
                        AbstractC1209k.e(strH5, "toJson(...)");
                        return strH5;
                }
            }
        };
        Map mapD4 = b.d();
        AbstractC1223y.c(1, interfaceC1182c7);
        mapD4.put(YosMediaItem.class, interfaceC1182c7);
        b.c().put(YosMediaItem.class, interfaceC1182c8);
        final int i15 = 1;
        InterfaceC1182c interfaceC1182c9 = new InterfaceC1182c() { // from class: U5.b0
            @Override // l5.InterfaceC1182c
            public final Object b(Object obj) {
                C0196m c0196m = c0196mA;
                switch (i15) {
                    case 0:
                        String str = (String) obj;
                        int i82 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str, "str");
                        return (YosMediaItem) c0196m.b(YosMediaItem.class, str);
                    case 1:
                        int i92 = YosBasicApplication.f20577o;
                        String strH = c0196m.h((YosStringWrapper) obj);
                        AbstractC1209k.e(strH, "toJson(...)");
                        return strH;
                    case 2:
                        String str2 = (String) obj;
                        int i102 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str2, "str");
                        return (YosStringWrapper) c0196m.b(YosStringWrapper.class, str2);
                    case 3:
                        int i112 = YosBasicApplication.f20577o;
                        String strH2 = c0196m.h((Folder) obj);
                        AbstractC1209k.e(strH2, "toJson(...)");
                        return strH2;
                    case 4:
                        String str3 = (String) obj;
                        int i122 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str3, "str");
                        return (Folder) c0196m.b(Folder.class, str3);
                    case 5:
                        int i132 = YosBasicApplication.f20577o;
                        String strH3 = c0196m.h((PlayList) obj);
                        AbstractC1209k.e(strH3, "toJson(...)");
                        return strH3;
                    case 6:
                        String str4 = (String) obj;
                        int i142 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str4, "str");
                        return (PlayList) c0196m.b(PlayList.class, str4);
                    case 7:
                        int i152 = YosBasicApplication.f20577o;
                        String strH4 = c0196m.h((int[]) obj);
                        AbstractC1209k.e(strH4, "toJson(...)");
                        return strH4;
                    case 8:
                        String str5 = (String) obj;
                        int i16 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str5, "str");
                        return (int[]) c0196m.b(int[].class, str5);
                    default:
                        int i17 = YosBasicApplication.f20577o;
                        String strH5 = c0196m.h((YosMediaItem) obj);
                        AbstractC1209k.e(strH5, "toJson(...)");
                        return strH5;
                }
            }
        };
        final int i16 = 2;
        InterfaceC1182c interfaceC1182c10 = new InterfaceC1182c() { // from class: U5.b0
            @Override // l5.InterfaceC1182c
            public final Object b(Object obj) {
                C0196m c0196m = c0196mA;
                switch (i16) {
                    case 0:
                        String str = (String) obj;
                        int i82 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str, "str");
                        return (YosMediaItem) c0196m.b(YosMediaItem.class, str);
                    case 1:
                        int i92 = YosBasicApplication.f20577o;
                        String strH = c0196m.h((YosStringWrapper) obj);
                        AbstractC1209k.e(strH, "toJson(...)");
                        return strH;
                    case 2:
                        String str2 = (String) obj;
                        int i102 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str2, "str");
                        return (YosStringWrapper) c0196m.b(YosStringWrapper.class, str2);
                    case 3:
                        int i112 = YosBasicApplication.f20577o;
                        String strH2 = c0196m.h((Folder) obj);
                        AbstractC1209k.e(strH2, "toJson(...)");
                        return strH2;
                    case 4:
                        String str3 = (String) obj;
                        int i122 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str3, "str");
                        return (Folder) c0196m.b(Folder.class, str3);
                    case 5:
                        int i132 = YosBasicApplication.f20577o;
                        String strH3 = c0196m.h((PlayList) obj);
                        AbstractC1209k.e(strH3, "toJson(...)");
                        return strH3;
                    case 6:
                        String str4 = (String) obj;
                        int i142 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str4, "str");
                        return (PlayList) c0196m.b(PlayList.class, str4);
                    case 7:
                        int i152 = YosBasicApplication.f20577o;
                        String strH4 = c0196m.h((int[]) obj);
                        AbstractC1209k.e(strH4, "toJson(...)");
                        return strH4;
                    case 8:
                        String str5 = (String) obj;
                        int i162 = YosBasicApplication.f20577o;
                        AbstractC1209k.f(str5, "str");
                        return (int[]) c0196m.b(int[].class, str5);
                    default:
                        int i17 = YosBasicApplication.f20577o;
                        String strH5 = c0196m.h((YosMediaItem) obj);
                        AbstractC1209k.e(strH5, "toJson(...)");
                        return strH5;
                }
            }
        };
        Map mapD5 = b.d();
        AbstractC1223y.c(1, interfaceC1182c9);
        mapD5.put(YosStringWrapper.class, interfaceC1182c9);
        b.c().put(YosStringWrapper.class, interfaceC1182c10);
        super.onCreate();
        B1 b12 = new B1(this, new ComponentName(this, (Class<?>) YosPlaybackService.class));
        Bundle bundle = Bundle.EMPTY;
        C0746L c0746l = new C0746L(20);
        Looper looperO = t.o();
        C1762z c1762z = new C1762z(looperO);
        t.G(new Handler(looperO), new RunnableC1754v(c1762z, new C1760y(this, b12, bundle, c0746l, looperO, c1762z, b12.f18932a.o() ? new a(new j(this)) : null), 0));
        c1762z.b(new e(11, c1762z), I4.r.f3531o);
    }
}
