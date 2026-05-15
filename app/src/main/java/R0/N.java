package R0;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;
import o5.AbstractC1267a;
import w5.AbstractC1767D;

/* JADX INFO: loaded from: classes.dex */
public final class N extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f6360p;

    /* JADX INFO: renamed from: q */
    public static final N f6350q = new N(0, 0);

    /* JADX INFO: renamed from: r */
    public static final N f6351r = new N(0, 1);

    /* JADX INFO: renamed from: s */
    public static final N f6352s = new N(0, 2);

    /* JADX INFO: renamed from: t */
    public static final N f6353t = new N(0, 3);

    /* JADX INFO: renamed from: u */
    public static final N f6354u = new N(0, 4);

    /* JADX INFO: renamed from: v */
    public static final N f6355v = new N(0, 5);

    /* JADX INFO: renamed from: w */
    public static final N f6356w = new N(0, 6);

    /* JADX INFO: renamed from: x */
    public static final N f6357x = new N(0, 7);

    /* JADX INFO: renamed from: y */
    public static final N f6358y = new N(0, 8);

    /* JADX INFO: renamed from: z */
    public static final N f6359z = new N(0, 9);

    /* JADX INFO: renamed from: A */
    public static final N f6331A = new N(0, 10);

    /* JADX INFO: renamed from: B */
    public static final N f6332B = new N(0, 11);

    /* JADX INFO: renamed from: C */
    public static final N f6333C = new N(0, 12);

    /* JADX INFO: renamed from: D */
    public static final N f6334D = new N(0, 13);

    /* JADX INFO: renamed from: E */
    public static final N f6335E = new N(0, 14);

    /* JADX INFO: renamed from: F */
    public static final N f6336F = new N(0, 15);

    /* JADX INFO: renamed from: G */
    public static final N f6337G = new N(0, 16);

    /* JADX INFO: renamed from: H */
    public static final N f6338H = new N(0, 17);

    /* JADX INFO: renamed from: I */
    public static final N f6339I = new N(0, 18);

    /* JADX INFO: renamed from: J */
    public static final N f6340J = new N(0, 19);

    /* JADX INFO: renamed from: K */
    public static final N f6341K = new N(0, 20);

    /* JADX INFO: renamed from: L */
    public static final N f6342L = new N(0, 21);

    /* JADX INFO: renamed from: M */
    public static final N f6343M = new N(0, 22);

    /* JADX INFO: renamed from: N */
    public static final N f6344N = new N(0, 23);

    /* JADX INFO: renamed from: O */
    public static final N f6345O = new N(0, 24);

    /* JADX INFO: renamed from: P */
    public static final N f6346P = new N(0, 25);

    /* JADX INFO: renamed from: Q */
    public static final N f6347Q = new N(0, 26);

    /* JADX INFO: renamed from: R */
    public static final N f6348R = new N(0, 27);

    /* JADX INFO: renamed from: S */
    public static final N f6349S = new N(0, 28);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(int i7, int i8) {
        super(i7);
        this.f6360p = i8;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        Choreographer choreographer;
        switch (this.f6360p) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 5:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    D5.e eVar = w5.M.f19497a;
                    choreographer = (Choreographer) AbstractC1767D.x(B5.n.f912a, new W(2, null));
                }
                Y y6 = new Y(choreographer, AbstractC1267a.r(Looper.getMainLooper()));
                return I0.c.L(y6, y6.f6398z);
            case 6:
            case 7:
                return null;
            case 8:
                AbstractC0403q0.b("LocalAutofillManager");
                throw null;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                AbstractC0403q0.b("LocalAutofillTree");
                throw null;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                AbstractC0403q0.b("LocalClipboard");
                throw null;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                AbstractC0403q0.b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                AbstractC0403q0.b("LocalDensity");
                throw null;
            case 14:
                AbstractC0403q0.b("LocalFocusManager");
                throw null;
            case 15:
                AbstractC0403q0.b("LocalFontFamilyResolver");
                throw null;
            case 16:
                AbstractC0403q0.b("LocalFontLoader");
                throw null;
            case 17:
                AbstractC0403q0.b("LocalGraphicsContext");
                throw null;
            case 18:
                AbstractC0403q0.b("LocalHapticFeedback");
                throw null;
            case 19:
                AbstractC0403q0.b("LocalInputManager");
                throw null;
            case BuildConfig.API_VERSION /* 20 */:
                AbstractC0403q0.b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
            case 24:
                return null;
            case 25:
                AbstractC0403q0.b("LocalTextToolbar");
                throw null;
            case 26:
                AbstractC0403q0.b("LocalUriHandler");
                throw null;
            case 27:
                AbstractC0403q0.b("LocalViewConfiguration");
                throw null;
            default:
                AbstractC0403q0.b("LocalWindowInfo");
                throw null;
        }
    }
}
