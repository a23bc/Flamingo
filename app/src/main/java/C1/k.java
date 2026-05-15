package C1;

import F2.y;
import N2.C0293j;
import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.C1115c;
import k.C1116d;
import k.C1117e;
import k.C1118f;
import k.DialogInterfaceC1119g;
import k0.C1135l;
import n4.C1230a;
import n4.C1231b;
import n4.C1235f;
import w2.t;
import w3.C1751t0;
import w3.N0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements y {

    /* JADX INFO: renamed from: o */
    public int f959o;

    /* JADX INFO: renamed from: p */
    public Object f960p;

    public /* synthetic */ k(Object obj) {
        this.f959o = 0;
        this.f960p = obj;
    }

    @Override // F2.y
    public boolean A(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // F2.y
    public boolean I() {
        return true;
    }

    public void a() {
        WeakReference weakReference;
        this.f959o = 0;
        Iterator it = ((LinkedHashMap) this.f960p).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                C1235f c1235f = (C1235f) Z4.n.r0(arrayList);
                if (((c1235f == null || (weakReference = c1235f.f14550b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    int i9 = i8 - i7;
                    if (((C1235f) arrayList.get(i9)).f14550b.get() == null) {
                        arrayList.remove(i9);
                        i7++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC1119g b() {
        C1116d c1116d = (C1116d) this.f960p;
        DialogInterfaceC1119g dialogInterfaceC1119g = new DialogInterfaceC1119g((ContextThemeWrapper) c1116d.f13884c, this.f959o);
        View view = (View) c1116d.f13888g;
        C1118f c1118f = dialogInterfaceC1119g.f13914t;
        if (view != null) {
            c1118f.f13902n = view;
        } else {
            CharSequence charSequence = (CharSequence) c1116d.f13887f;
            if (charSequence != null) {
                c1118f.f13894d = charSequence;
                TextView textView = c1118f.l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = (Drawable) c1116d.f13886e;
            if (drawable != null) {
                c1118f.f13899j = drawable;
                ImageView imageView = c1118f.f13900k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c1118f.f13900k.setImageDrawable(drawable);
                }
            }
        }
        if (c1116d.f13889i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ((LayoutInflater) c1116d.f13885d).inflate(c1118f.f13906r, (ViewGroup) null);
            int i7 = c1116d.f13883b ? c1118f.f13907s : c1118f.f13908t;
            Object obj = c1116d.f13889i;
            ?? c1117e = obj;
            if (obj == null) {
                c1117e = new C1117e((ContextThemeWrapper) c1116d.f13884c, i7, R.id.text1, null);
            }
            c1118f.f13903o = c1117e;
            c1118f.f13904p = c1116d.f13882a;
            if (((DialogInterface.OnClickListener) c1116d.f13890j) != null) {
                alertController$RecycleListView.setOnItemClickListener(new C1115c(c1116d, c1118f));
            }
            if (c1116d.f13883b) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c1118f.f13895e = alertController$RecycleListView;
        }
        dialogInterfaceC1119g.setCancelable(true);
        dialogInterfaceC1119g.setCanceledOnTouchOutside(true);
        dialogInterfaceC1119g.setOnCancelListener(null);
        dialogInterfaceC1119g.setOnDismissListener(null);
        p.m mVar = (p.m) c1116d.h;
        if (mVar != null) {
            dialogInterfaceC1119g.setOnKeyListener(mVar);
        }
        return dialogInterfaceC1119g;
    }

    public PendingIntent c(C1751t0 c1751t0, long j3) {
        int i7 = (j3 == 8 || j3 == 9) ? 87 : (j3 == 6 || j3 == 7) ? 88 : j3 == 3 ? 86 : j3 == 12 ? 90 : j3 == 11 ? 89 : j3 == 1 ? 85 : 0;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(c1751t0.f19363a.f18899b);
        N0 n02 = (N0) this.f960p;
        intent.setComponent(new ComponentName(n02, n02.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i7));
        int i8 = t.f18881a;
        if (i8 < 26 || j3 != 1 || c1751t0.a().C()) {
            return PendingIntent.getService(n02, i7, intent, i8 >= 23 ? 67108864 : 0);
        }
        return PendingIntent.getForegroundService(n02, i7, intent, 67108864);
    }

    @Override // F2.y
    public MediaCodecInfo d(int i7) {
        if (((MediaCodecInfo[]) this.f960p) == null) {
            this.f960p = new MediaCodecList(this.f959o).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f960p)[i7];
    }

    public synchronized C1231b e(C1230a c1230a) {
        try {
            ArrayList arrayList = (ArrayList) ((LinkedHashMap) this.f960p).get(c1230a);
            C1231b c1231b = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                C1235f c1235f = (C1235f) arrayList.get(i7);
                Bitmap bitmap = (Bitmap) c1235f.f14550b.get();
                C1231b c1231b2 = bitmap != null ? new C1231b(bitmap, c1235f.f14551c) : null;
                if (c1231b2 != null) {
                    c1231b = c1231b2;
                    break;
                }
                i7++;
            }
            int i8 = this.f959o;
            this.f959o = i8 + 1;
            if (i8 >= 10) {
                a();
            }
            return c1231b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean f() {
        return this.f959o < ((ArrayList) this.f960p).size();
    }

    public long g(C0293j c0293j) {
        w2.m mVar = (w2.m) this.f960p;
        int i7 = 0;
        c0293j.i(mVar.f18867a, 0, 1, false);
        int i8 = mVar.f18867a[0] & 255;
        if (i8 == 0) {
            return Long.MIN_VALUE;
        }
        int i9 = 128;
        int i10 = 0;
        while ((i8 & i9) == 0) {
            i9 >>= 1;
            i10++;
        }
        int i11 = i8 & (~i9);
        c0293j.i(mVar.f18867a, 1, i10, false);
        while (i7 < i10) {
            i7++;
            i11 = (mVar.f18867a[i7] & 255) + (i11 << 8);
        }
        this.f959o = i10 + 1 + this.f959o;
        return i11;
    }

    public synchronized void h(C1230a c1230a, Bitmap bitmap, Map map, int i7) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f960p;
            Object arrayList = linkedHashMap.get(c1230a);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c1230a, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            C1235f c1235f = new C1235f(iIdentityHashCode, new WeakReference(bitmap), map, i7);
            int size = arrayList2.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    arrayList2.add(c1235f);
                    break;
                }
                C1235f c1235f2 = (C1235f) arrayList2.get(i8);
                if (i7 < c1235f2.f14552d) {
                    i8++;
                } else if (c1235f2.f14549a == iIdentityHashCode && c1235f2.f14550b.get() == bitmap) {
                    arrayList2.set(i8, c1235f);
                } else {
                    arrayList2.add(i8, c1235f);
                }
            }
            int i9 = this.f959o;
            this.f959o = i9 + 1;
            if (i9 >= 10) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // F2.y
    public boolean q(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // F2.y
    public int r() {
        if (((MediaCodecInfo[]) this.f960p) == null) {
            this.f960p = new MediaCodecList(this.f959o).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f960p).length;
    }

    public k(int i7, List list) {
        this.f959o = i7;
        this.f960p = list;
    }

    public k(C1135l c1135l, int i7) {
        this.f960p = c1135l;
        this.f959o = i7;
    }

    public k(int i7, Notification notification) {
        this.f959o = i7;
        notification.getClass();
        this.f960p = notification;
    }

    public k(Context context) {
        int i7 = DialogInterfaceC1119g.i(context, 0);
        this.f960p = new C1116d(new ContextThemeWrapper(context, DialogInterfaceC1119g.i(context, i7)));
        this.f959o = i7;
    }

    public k(int i7) {
        switch (i7) {
            case 4:
                this.f960p = new w2.m(8);
                break;
            case 7:
                this.f960p = new LinkedHashMap();
                break;
            default:
                this.f959o = 1;
                this.f960p = Collections.singletonList(null);
                break;
        }
    }
}
