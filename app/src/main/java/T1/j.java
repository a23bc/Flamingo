package T1;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import t.C1451f;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: j */
    public static final Object f6858j = new Object();

    /* JADX INFO: renamed from: k */
    public static volatile j f6859k;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f6860a;

    /* JADX INFO: renamed from: b */
    public final C1451f f6861b;

    /* JADX INFO: renamed from: c */
    public volatile int f6862c;

    /* JADX INFO: renamed from: d */
    public final Handler f6863d;

    /* JADX INFO: renamed from: e */
    public final f f6864e;

    /* JADX INFO: renamed from: f */
    public final i f6865f;

    /* JADX INFO: renamed from: g */
    public final N2.z f6866g;
    public final int h;

    /* JADX INFO: renamed from: i */
    public final d f6867i;

    public j(r rVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f6860a = reentrantReadWriteLock;
        this.f6862c = 3;
        i iVar = rVar.f6891a;
        this.f6865f = iVar;
        int i7 = rVar.f6892b;
        this.h = i7;
        this.f6867i = rVar.f6893c;
        this.f6863d = new Handler(Looper.getMainLooper());
        this.f6861b = new C1451f(0);
        this.f6866g = new N2.z();
        f fVar = new f(this);
        this.f6864e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i7 == 0) {
            try {
                this.f6862c = 0;
            } catch (Throwable th) {
                this.f6860a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                iVar.a(new e(fVar));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f6858j) {
            try {
                jVar = f6859k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public static boolean d() {
        return f6859k != null;
    }

    public final int b(CharSequence charSequence, int i7) {
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        N5.d.r(charSequence, "charSequence cannot be null");
        A0.b bVar = this.f6864e.f6853b;
        bVar.getClass();
        if (i7 < 0 || i7 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            w[] wVarArr = (w[]) spanned.getSpans(i7, i7 + 1, w.class);
            if (wVarArr.length > 0) {
                return spanned.getSpanStart(wVarArr[0]);
            }
        }
        return ((o) bVar.i0(charSequence, Math.max(0, i7 - 16), Math.min(charSequence.length(), i7 + 16), Integer.MAX_VALUE, true, new o(i7))).f6874p;
    }

    public final int c() {
        this.f6860a.readLock().lock();
        try {
            return this.f6862c;
        } finally {
            this.f6860a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (c() == 1) {
            return;
        }
        this.f6860a.writeLock().lock();
        try {
            if (this.f6862c == 0) {
                return;
            }
            this.f6862c = 0;
            this.f6860a.writeLock().unlock();
            f fVar = this.f6864e;
            j jVar = fVar.f6852a;
            try {
                jVar.f6865f.a(new e(fVar));
            } catch (Throwable th) {
                jVar.f(th);
            }
        } finally {
            this.f6860a.writeLock().unlock();
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f6860a.writeLock().lock();
        try {
            this.f6862c = 2;
            arrayList.addAll(this.f6861b);
            this.f6861b.clear();
            this.f6860a.writeLock().unlock();
            this.f6863d.post(new h(arrayList, this.f6862c, th));
        } catch (Throwable th2) {
            this.f6860a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x008c A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #2 {all -> 0x007f, blocks: (B:149:0x0057, B:152:0x005c, B:154:0x0060, B:156:0x006d, B:163:0x008c, B:165:0x0096, B:167:0x0099, B:169:0x009c, B:171:0x00ac, B:172:0x00af), top: B:216:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x009c A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:149:0x0057, B:152:0x005c, B:154:0x0060, B:156:0x006d, B:163:0x008c, B:165:0x0096, B:167:0x0099, B:169:0x009c, B:171:0x00ac, B:172:0x00af), top: B:216:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00be A[Catch: all -> 0x00f4, TRY_ENTER, TryCatch #1 {all -> 0x00f4, blocks: (B:176:0x00be, B:179:0x00c6, B:161:0x0082), top: B:214:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence g(int r12, int r13, int r14, java.lang.CharSequence r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.j.g(int, int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void h(g gVar) {
        N5.d.r(gVar, "initCallback cannot be null");
        this.f6860a.writeLock().lock();
        try {
            if (this.f6862c == 1 || this.f6862c == 2) {
                this.f6863d.post(new h(Arrays.asList(gVar), this.f6862c, null));
            } else {
                this.f6861b.add(gVar);
            }
            this.f6860a.writeLock().unlock();
        } catch (Throwable th) {
            this.f6860a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        f fVar = this.f6864e;
        fVar.getClass();
        Bundle bundle = editorInfo.extras;
        U1.b bVar = (U1.b) fVar.f6854c.f7042o;
        int iB = bVar.b(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iB != 0 ? ((ByteBuffer) bVar.f2745r).getInt(iB + bVar.f2742o) : 0);
        Bundle bundle2 = editorInfo.extras;
        fVar.f6852a.getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
