package B2;

import A2.N;
import E4.G;
import E4.I;
import E4.K;
import E4.b0;
import E4.g0;
import H2.A;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import j5.AbstractC1109c;
import m5.AbstractC1209k;
import q.C1336s;
import q.K0;
import q.P0;
import t2.T;
import t2.e0;
import t2.h0;
import w2.t;
import w3.n1;
import w3.t1;
import w3.w1;
import w3.x1;
import y1.AbstractC1992a;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f754f;

    public h(int i7) {
        switch (i7) {
            case 3:
                this.f749a = n1.f19254F.l(t1.f19364g);
                this.f751c = w1.f19385b;
                this.f752d = T.f16353b;
                this.f750b = b0.f1913s;
                this.f753e = Bundle.EMPTY;
                this.f754f = null;
                break;
            default:
                this.f749a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.f750b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f751c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.f752d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.f753e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f754f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    public static boolean b(int[] iArr, int i7) {
        for (int i8 : iArr) {
            if (i8 == i7) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList c(Context context, int i7) {
        int iC = P0.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{P0.f15217b, P0.f15219d, P0.f15218c, P0.f15221f}, new int[]{P0.b(context, R.attr.colorButtonNormal), AbstractC1992a.b(iC, i7), AbstractC1992a.b(iC, i7), i7});
    }

    public static A d(N n7, I i7, A a4, e0 e0Var) {
        h0 h0VarM0 = n7.m0();
        int iN = n7.N();
        Object objL = h0VarM0.p() ? null : h0VarM0.l(iN);
        int iB = (n7.r() || h0VarM0.p()) ? -1 : h0VarM0.f(iN, e0Var, false).b(t.D(n7.F0()) - e0Var.f16430e);
        for (int i8 = 0; i8 < i7.size(); i8++) {
            A a7 = (A) i7.get(i8);
            if (g(a7, objL, n7.r(), n7.U(), n7.e0(), iB)) {
                return a7;
            }
        }
        if (i7.isEmpty() && a4 != null && g(a4, objL, n7.r(), n7.U(), n7.e0(), iB)) {
            return a4;
        }
        return null;
    }

    public static LayerDrawable e(K0 k02, Context context, int i7) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i7);
        Drawable drawableF = k02.f(context, R.drawable.abc_star_black_48dp);
        Drawable drawableF2 = k02.f(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean g(A a4, Object obj, boolean z6, int i7, int i8, int i9) {
        if (!a4.f2973a.equals(obj)) {
            return false;
        }
        int i10 = a4.f2974b;
        if (z6 && i10 == i7 && a4.f2975c == i8) {
            return true;
        }
        return !z6 && i10 == -1 && a4.f2977e == i9;
    }

    public static void h(Drawable drawable, int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterH;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C1336s.f15388b;
        }
        PorterDuff.Mode mode2 = C1336s.f15388b;
        synchronized (C1336s.class) {
            porterDuffColorFilterH = K0.h(i7, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterH);
    }

    public void a(D4.i iVar, A a4, h0 h0Var) {
        if (a4 == null) {
            return;
        }
        if (h0Var.b(a4.f2973a) != -1) {
            iVar.z(a4, h0Var);
            return;
        }
        h0 h0Var2 = (h0) ((K) this.f751c).get(a4);
        if (h0Var2 != null) {
            iVar.z(a4, h0Var2);
        }
    }

    public ColorStateList f(Context context, int i7) {
        if (i7 == R.drawable.abc_edit_text_material) {
            return AbstractC1109c.r(context, R.color.abc_tint_edittext);
        }
        if (i7 == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC1109c.r(context, R.color.abc_tint_switch_track);
        }
        if (i7 != R.drawable.abc_switch_thumb_material) {
            if (i7 == R.drawable.abc_btn_default_mtrl_shape) {
                return c(context, P0.c(context, R.attr.colorButtonNormal));
            }
            if (i7 == R.drawable.abc_btn_borderless_material) {
                return c(context, 0);
            }
            if (i7 == R.drawable.abc_btn_colored_material) {
                return c(context, P0.c(context, R.attr.colorAccent));
            }
            if (i7 == R.drawable.abc_spinner_mtrl_am_alpha || i7 == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC1109c.r(context, R.color.abc_tint_spinner);
            }
            if (b((int[]) this.f750b, i7)) {
                return P0.d(context, R.attr.colorControlNormal);
            }
            if (b((int[]) this.f753e, i7)) {
                return AbstractC1109c.r(context, R.color.abc_tint_default);
            }
            if (b((int[]) this.f754f, i7)) {
                return AbstractC1109c.r(context, R.color.abc_tint_btn_checkable);
            }
            if (i7 == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC1109c.r(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = P0.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = P0.f15217b;
            iArr2[0] = P0.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = P0.f15220e;
            iArr2[1] = P0.c(context, R.attr.colorControlActivated);
            iArr[2] = P0.f15221f;
            iArr2[2] = P0.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = P0.f15217b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = P0.f15220e;
            iArr2[1] = P0.c(context, R.attr.colorControlActivated);
            iArr[2] = P0.f15221f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void i(h0 h0Var) {
        D4.i iVar = new D4.i(4);
        if (((I) this.f750b).isEmpty()) {
            a(iVar, (A) this.f753e, h0Var);
            if (!M3.a.L((A) this.f754f, (A) this.f753e)) {
                a(iVar, (A) this.f754f, h0Var);
            }
            if (!M3.a.L((A) this.f752d, (A) this.f753e) && !M3.a.L((A) this.f752d, (A) this.f754f)) {
                a(iVar, (A) this.f752d, h0Var);
            }
        } else {
            for (int i7 = 0; i7 < ((I) this.f750b).size(); i7++) {
                a(iVar, (A) ((I) this.f750b).get(i7), h0Var);
            }
            if (!((I) this.f750b).contains((A) this.f752d)) {
                a(iVar, (A) this.f752d, h0Var);
            }
        }
        this.f751c = iVar.d();
    }

    public h(I5.d dVar) {
        AbstractC1209k.f(dVar, "taskRunner");
        this.f749a = dVar;
        this.f754f = M5.h.f4858a;
    }

    public h(e0 e0Var) {
        this.f749a = e0Var;
        G g6 = I.f1870p;
        this.f750b = b0.f1913s;
        this.f751c = g0.f1938u;
    }

    public h(n1 n1Var, w1 w1Var, T t7, I i7, Bundle bundle, x1 x1Var) {
        this.f749a = n1Var;
        this.f751c = w1Var;
        this.f752d = t7;
        this.f750b = i7;
        this.f753e = bundle == null ? Bundle.EMPTY : bundle;
        this.f754f = x1Var;
    }
}
