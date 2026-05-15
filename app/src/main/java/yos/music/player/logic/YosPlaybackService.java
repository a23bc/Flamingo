package yos.music.player.logic;

import A2.C0017s;
import A2.N;
import B2.e;
import D.A0;
import E4.I;
import E4.b0;
import H.P;
import L2.C0247a;
import X.r;
import Y4.m;
import Z4.v;
import a.AbstractC0509a;
import a6.b;
import a6.d;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.os.Bundle;
import b6.i;
import b6.u;
import b6.w;
import cn.lyric.getter.api.API;
import cn.lyric.getter.api.data.ExtraData;
import com.hchen.superlyricapi.SuperLyricData;
import com.hchen.superlyricapi.SuperLyricPush;
import d6.a;
import d6.f;
import i6.h;
import java.util.List;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import t2.C1476e;
import t2.E;
import t2.G;
import t2.J;
import t2.X;
import u5.AbstractC1545g;
import w2.AbstractC1697a;
import w2.t;
import w3.AbstractC1740n0;
import w3.C1709a;
import w3.C1751t0;
import w3.C1760y;
import w3.N0;
import w3.v1;
import w5.AbstractC1767D;
import w5.M;
import w5.w0;
import y2.j;
import yos.music.player.MainActivity;
import yos.music.player.R;
import yos.music.player.data.libraries.SettingsLibrary;

/* JADX INFO: loaded from: classes.dex */
public final class YosPlaybackService extends N0 {

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ int f20580B = 0;

    /* JADX INFO: renamed from: A */
    public w0 f20581A;

    /* JADX INFO: renamed from: v */
    public final String f20582v = "shuffle_mode";

    /* JADX INFO: renamed from: w */
    public final String f20583w = "repeat_mode";

    /* JADX INFO: renamed from: x */
    public final String f20584x;

    /* JADX INFO: renamed from: y */
    public final m f20585y;

    /* JADX INFO: renamed from: z */
    public int f20586z;

    public YosPlaybackService() {
        Drawable drawable = h.z().getDrawable(R.drawable.flamingo_icon_notification);
        AbstractC1209k.c(drawable);
        int i7 = Build.VERSION.SDK_INT;
        String strT = "";
        if (i7 >= 26 && r.z(drawable)) {
            AdaptiveIconDrawable adaptiveIconDrawableE = r.e(drawable);
            if (i7 >= 26) {
                Drawable background = adaptiveIconDrawableE.getBackground();
                Drawable foreground = adaptiveIconDrawableE.getForeground();
                if (background != null && foreground != null) {
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{background, foreground});
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    AbstractC1209k.e(bitmapCreateBitmap, "createBitmap(layerDrawab… Bitmap.Config.ARGB_8888)");
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    layerDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    layerDrawable.draw(canvas);
                    strT = AbstractC1267a.t(bitmapCreateBitmap);
                }
            }
        } else if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            AbstractC1209k.e(bitmap, "drawable.bitmap");
            strT = AbstractC1267a.t(bitmap);
        } else if (drawable instanceof VectorDrawable) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            AbstractC1209k.e(bitmapCreateBitmap2, "createBitmap(drawable.in… Bitmap.Config.ARGB_8888)");
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawable.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
            drawable.draw(canvas2);
            strT = AbstractC1267a.t(bitmapCreateBitmap2);
        } else {
            try {
                Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                AbstractC1209k.e(bitmap2, "drawable as BitmapDrawable).bitmap");
                strT = AbstractC1267a.t(bitmap2);
            } catch (Exception unused) {
            }
        }
        this.f20584x = strT;
        this.f20585y = AbstractC0509a.O(new A0(19));
    }

    public static final void j(YosPlaybackService yosPlaybackService, int i7) {
        X xA;
        G gI0;
        J j3;
        G gI02;
        J j7;
        if (i7 != yosPlaybackService.f20586z) {
            yosPlaybackService.f20586z = i7;
            String str = "";
            System.out.getClass();
            try {
                int i8 = yosPlaybackService.f20586z;
                if (i8 >= -1) {
                    b.f8883a.j(i8);
                }
                if (yosPlaybackService.f20586z == -1) {
                    return;
                }
                SettingsLibrary settingsLibrary = SettingsLibrary.INSTANCE;
                if (settingsLibrary.getLyricGetterAPIEnabled() || settingsLibrary.getSuperLyricAPIEnabled() || settingsLibrary.getTickerLyricEnabled()) {
                    List list = (List) d.f8891a.getValue();
                    StringBuffer stringBuffer = new StringBuffer("");
                    if (list.isEmpty()) {
                        C1751t0 c1751t0 = i.f10425e;
                        CharSequence charSequence = null;
                        if (c1751t0 == null) {
                            android.support.v4.media.session.b.f8937b = null;
                        } else {
                            X xA2 = c1751t0.a();
                            CharSequence charSequence2 = (xA2 == null || (gI02 = xA2.I0()) == null || (j7 = gI02.f16226d) == null) ? null : j7.f16304a;
                            C1751t0 c1751t02 = i.f10425e;
                            if (c1751t02 != null && (xA = c1751t02.a()) != null && (gI0 = xA.I0()) != null && (j3 = gI0.f16226d) != null) {
                                charSequence = j3.f16305b;
                            }
                            stringBuffer.append(((Object) charSequence2) + " - " + ((Object) charSequence));
                            if (AbstractC1209k.a(stringBuffer.toString(), android.support.v4.media.session.b.f8938c)) {
                                return;
                            } else {
                                android.support.v4.media.session.b.f8937b = stringBuffer.toString();
                            }
                        }
                    } else {
                        f fVar = (f) list.get(yosPlaybackService.f20586z);
                        if (fVar.f11294s.isEmpty()) {
                            String str2 = fVar.f11293r;
                            if (str2 != null && !AbstractC1545g.Z(str2)) {
                                stringBuffer.append(str2);
                            }
                            return;
                        }
                        for (a aVar : fVar.f11294s) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(aVar.f11276q);
                            sb.append(aVar.f11277r ? " " : "");
                            stringBuffer.append(sb.toString());
                        }
                        if (AbstractC1209k.a(stringBuffer.toString(), android.support.v4.media.session.b.f8938c)) {
                            return;
                        } else {
                            android.support.v4.media.session.b.f8937b = stringBuffer.toString();
                        }
                    }
                    System.out.getClass();
                    if (AbstractC1209k.a(android.support.v4.media.session.b.f8938c, android.support.v4.media.session.b.f8937b)) {
                        return;
                    }
                    SettingsLibrary settingsLibrary2 = SettingsLibrary.INSTANCE;
                    boolean lyricGetterAPIEnabled = settingsLibrary2.getLyricGetterAPIEnabled();
                    String str3 = yosPlaybackService.f20584x;
                    if (lyricGetterAPIEnabled && settingsLibrary2.getLyricGetterAPIHooked()) {
                        System.out.getClass();
                        API api = (API) yosPlaybackService.f20585y.getValue();
                        String str4 = android.support.v4.media.session.b.f8937b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        ExtraData extraData = new ExtraData();
                        extraData.setCustomIcon(true);
                        extraData.setBase64Icon(str3);
                        api.sendLyric(str4, extraData);
                    }
                    if (settingsLibrary2.getSuperLyricAPIEnabled() && settingsLibrary2.getSuperLyricAPIHooked()) {
                        System.out.getClass();
                        SuperLyricData superLyricData = new SuperLyricData();
                        String str5 = android.support.v4.media.session.b.f8937b;
                        if (str5 != null) {
                            str = str5;
                        }
                        SuperLyricPush.onSuperLyric(superLyricData.setLyric(str).setPackageName("yos.music.player").setBase64Icon(str3));
                    }
                    if (settingsLibrary2.getTickerLyricEnabled()) {
                        System.out.getClass();
                        C1751t0 c1751t03 = i.f10425e;
                        if (c1751t03 != null) {
                            System.out.getClass();
                            M3.a.f4763b = true;
                            yosPlaybackService.f(c1751t03, false);
                            M3.a.f4763b = false;
                        }
                    }
                    android.support.v4.media.session.b.f8938c = android.support.v4.media.session.b.f8937b;
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    public final void k(P p7) {
        SettingsLibrary settingsLibrary = SettingsLibrary.INSTANCE;
        if (!settingsLibrary.getNotificationEnableIcon()) {
            C1751t0 c1751t0 = i.f10425e;
            if (c1751t0 != null) {
                c1751t0.b(v.f8818o);
                return;
            }
            return;
        }
        boolean notificationSmallerIcon = settingsLibrary.getNotificationSmallerIcon();
        int i7 = p7.r0() ? notificationSmallerIcon ? R.drawable.ic_mini_shuffle : R.drawable.ic_shuffle : notificationSmallerIcon ? R.drawable.ic_mini_shuffle_off : R.drawable.ic_shuffle_off;
        String str = C1709a.f19116i;
        Bundle bundle = Bundle.EMPTY;
        C1709a c1709a = new C1709a(new v1(this.f20582v, new Bundle()), -1, 0, i7, null, this.f20582v, bundle, true);
        int i8 = p7.i();
        C1709a c1709a2 = new C1709a(new v1(this.f20583w, new Bundle()), -1, 0, i8 != 1 ? i8 != 2 ? notificationSmallerIcon ? R.drawable.ic_mini_repeat_off : R.drawable.ic_repeat_off : notificationSmallerIcon ? R.drawable.ic_mini_repeat : R.drawable.ic_repeat : notificationSmallerIcon ? R.drawable.ic_mini_repeat_one : R.drawable.ic_repeat_one, null, this.f20583w, bundle, true);
        C1751t0 c1751t02 = i.f10425e;
        if (c1751t02 != null) {
            c1751t02.b(I.u(c1709a, c1709a2));
        }
    }

    public final void l(C1760y c1760y) {
        SettingsLibrary settingsLibrary = SettingsLibrary.INSTANCE;
        if (!settingsLibrary.getNotificationEnableIcon()) {
            C1751t0 c1751t0 = i.f10425e;
            if (c1751t0 != null) {
                c1751t0.b(v.f8818o);
                return;
            }
            return;
        }
        boolean notificationSmallerIcon = settingsLibrary.getNotificationSmallerIcon();
        int i7 = c1760y.r0() ? notificationSmallerIcon ? R.drawable.ic_mini_shuffle : R.drawable.ic_shuffle : notificationSmallerIcon ? R.drawable.ic_mini_shuffle_off : R.drawable.ic_shuffle_off;
        String str = C1709a.f19116i;
        Bundle bundle = Bundle.EMPTY;
        C1709a c1709a = new C1709a(new v1(this.f20582v, new Bundle()), -1, 0, i7, null, this.f20582v, bundle, true);
        int i8 = c1760y.i();
        C1709a c1709a2 = new C1709a(new v1(this.f20583w, new Bundle()), -1, 0, i8 != 1 ? i8 != 2 ? notificationSmallerIcon ? R.drawable.ic_mini_repeat_off : R.drawable.ic_repeat_off : notificationSmallerIcon ? R.drawable.ic_mini_repeat : R.drawable.ic_repeat : notificationSmallerIcon ? R.drawable.ic_mini_repeat_one : R.drawable.ic_repeat_one, null, this.f20583w, bundle, true);
        C1751t0 c1751t02 = i.f10425e;
        if (c1751t02 != null) {
            c1751t02.b(I.u(c1709a, c1709a2));
        }
    }

    @Override // w3.N0, android.app.Service
    public final void onCreate() {
        super.onCreate();
        C1476e c1476e = new C1476e(2, 0, 1, 1, 0);
        f6.b bVar = new f6.b(this);
        SettingsLibrary settingsLibrary = SettingsLibrary.INSTANCE;
        bVar.f12248e = settingsLibrary.getAudioFloatOutput();
        bVar.f12247d = true;
        bVar.f12249f = settingsLibrary.getHardwareAudioTrackPlayBackParams();
        String codec = settingsLibrary.getCodec();
        bVar.f12246c = AbstractC1209k.a(codec, "Auto") ? 2 : AbstractC1209k.a(codec, "System") ? 0 : 1;
        C0017s c0017s = new C0017s(this, bVar);
        boolean audioAttributes = settingsLibrary.getAudioAttributes();
        AbstractC1697a.i(!c0017s.f438v);
        c0017s.f426i = c1476e;
        c0017s.f427j = audioAttributes;
        AbstractC1697a.i(!c0017s.f438v);
        c0017s.f428k = true;
        AbstractC1697a.i(!c0017s.f438v);
        c0017s.f438v = true;
        N n7 = new N(c0017s);
        b6.v vVar = new b6.v(n7);
        vVar.A(new u(n7, 0, this));
        i iVar = i.f10421a;
        AbstractC1697a.d(n7.N0());
        Bundle bundle = Bundle.EMPTY;
        E4.G g6 = I.f1870p;
        b0 b0Var = b0.f1913s;
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) MainActivity.class), 201326592);
        if (t.f18881a >= 31) {
            AbstractC1697a.d(AbstractC1740n0.a(activity));
        }
        activity.getClass();
        i.f10425e = new C1751t0(this, vVar, activity, b0Var, new A0.b(this, n7, vVar, 18), new V1.a(new j(this)));
        if (settingsLibrary.getTickerLyricEnabled()) {
            C0247a c0247a = new C0247a(this, new A0(18));
            synchronized (this.f19023o) {
                this.f19028t = c0247a;
            }
        } else {
            E e7 = new E(this);
            e7.f16201q = R.drawable.flamingo_icon_notification;
            i(e7);
        }
        k(vVar);
        m mVarO = AbstractC0509a.O(new A0(20));
        AbstractC1767D.t(AbstractC1767D.a(M.f19498b), null, new w(new e(13, this), new I4.t(mVarO, 9, this), mVarO, null), 3);
    }

    @Override // w3.N0, android.app.Service
    public final void onDestroy() {
        C1751t0 c1751t0 = i.f10425e;
        if (c1751t0 != null) {
            c1751t0.a().a();
            try {
                synchronized (C1751t0.f19361b) {
                    C1751t0.f19362c.remove(c1751t0.f19363a.f18905i);
                }
                c1751t0.f19363a.q();
            } catch (Exception unused) {
            }
            i.f10425e = null;
        }
        super.onDestroy();
    }
}
