package M;

import android.R;
import android.os.Build;
import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: M.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0263h0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0263h0 f4583r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ EnumC0263h0[] f4584s;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f4585o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4586p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f4587q;

    static {
        EnumC0263h0 enumC0263h0 = new EnumC0263h0("Cut", 0, P.e.f5693a, R.string.cut, R.attr.actionModeCutDrawable);
        EnumC0263h0 enumC0263h02 = new EnumC0263h0("Copy", 1, P.e.f5694b, R.string.copy, R.attr.actionModeCopyDrawable);
        EnumC0263h0 enumC0263h03 = new EnumC0263h0("Paste", 2, P.e.f5695c, R.string.paste, R.attr.actionModePasteDrawable);
        EnumC0263h0 enumC0263h04 = new EnumC0263h0("SelectAll", 3, P.e.f5696d, R.string.selectAll, R.attr.actionModeSelectAllDrawable);
        EnumC0263h0 enumC0263h05 = new EnumC0263h0("Autofill", 4, P.e.f5697e, Build.VERSION.SDK_INT <= 26 ? yos.music.player.R.string.autofill : R.string.autofill, 0);
        f4583r = enumC0263h05;
        EnumC0263h0[] enumC0263h0Arr = {enumC0263h0, enumC0263h02, enumC0263h03, enumC0263h04, enumC0263h05};
        f4584s = enumC0263h0Arr;
        AbstractC1267a.u(enumC0263h0Arr);
    }

    public EnumC0263h0(String str, int i7, Object obj, int i8, int i9) {
        this.f4585o = obj;
        this.f4586p = i8;
        this.f4587q = i9;
    }

    public static EnumC0263h0 valueOf(String str) {
        return (EnumC0263h0) Enum.valueOf(EnumC0263h0.class, str);
    }

    public static EnumC0263h0[] values() {
        return (EnumC0263h0[]) f4584s.clone();
    }
}
