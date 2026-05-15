package R0;

import a1.EnumC0510a;
import android.R;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import b1.C0613I;
import b1.C0622g;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import q1.AbstractC1368i;
import r5.C1420a;
import t.C1444F;
import y0.AbstractC1978k;
import y0.C1976i;
import y0.EnumC1957G;

/* JADX INFO: loaded from: classes.dex */
public abstract class M implements R0 {

    /* JADX INFO: renamed from: a */
    public static final Class[] f6324a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean A(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[2];
        float f10 = fArr[3];
        float f11 = fArr[4];
        float f12 = fArr[5];
        float f13 = fArr[6];
        float f14 = fArr[7];
        float f15 = fArr[8];
        float f16 = fArr[9];
        float f17 = fArr[10];
        float f18 = fArr[11];
        float f19 = fArr[12];
        float f20 = fArr[13];
        float f21 = fArr[14];
        float f22 = fArr[15];
        float f23 = (f7 * f12) - (f8 * f11);
        float f24 = (f7 * f13) - (f9 * f11);
        float f25 = (f7 * f14) - (f10 * f11);
        float f26 = (f8 * f13) - (f9 * f12);
        float f27 = (f8 * f14) - (f10 * f12);
        float f28 = (f9 * f14) - (f10 * f13);
        float f29 = (f15 * f20) - (f16 * f19);
        float f30 = (f15 * f21) - (f17 * f19);
        float f31 = (f15 * f22) - (f18 * f19);
        float f32 = (f16 * f21) - (f17 * f20);
        float f33 = (f16 * f22) - (f18 * f20);
        float f34 = (f17 * f22) - (f18 * f21);
        float f35 = (f28 * f29) + (((f26 * f31) + ((f25 * f32) + ((f23 * f34) - (f24 * f33)))) - (f27 * f30));
        if (f35 != 0.0f) {
            float f36 = 1.0f / f35;
            fArr2[0] = ((f14 * f32) + ((f12 * f34) - (f13 * f33))) * f36;
            fArr2[1] = (((f9 * f33) + ((-f8) * f34)) - (f10 * f32)) * f36;
            fArr2[2] = ((f22 * f26) + ((f20 * f28) - (f21 * f27))) * f36;
            fArr2[3] = (((f17 * f27) + ((-f16) * f28)) - (f18 * f26)) * f36;
            float f37 = -f11;
            fArr2[4] = (((f13 * f31) + (f37 * f34)) - (f14 * f30)) * f36;
            fArr2[5] = ((f10 * f30) + ((f34 * f7) - (f9 * f31))) * f36;
            float f38 = -f19;
            fArr2[6] = (((f21 * f25) + (f38 * f28)) - (f22 * f24)) * f36;
            fArr2[7] = ((f18 * f24) + ((f28 * f15) - (f17 * f25))) * f36;
            fArr2[8] = ((f14 * f29) + ((f11 * f33) - (f12 * f31))) * f36;
            fArr2[9] = (((f31 * f8) + ((-f7) * f33)) - (f10 * f29)) * f36;
            fArr2[10] = ((f22 * f23) + ((f19 * f27) - (f20 * f25))) * f36;
            fArr2[11] = (((f25 * f16) + ((-f15) * f27)) - (f18 * f23)) * f36;
            fArr2[12] = (((f12 * f30) + (f37 * f32)) - (f13 * f29)) * f36;
            fArr2[13] = ((f9 * f29) + ((f7 * f32) - (f8 * f30))) * f36;
            fArr2[14] = (((f20 * f24) + (f38 * f26)) - (f21 * f23)) * f36;
            fArr2[15] = ((f17 * f23) + ((f15 * f26) - (f16 * f24))) * f36;
        }
        return !(f35 == 0.0f);
    }

    public static final boolean B(float f7, float f8, C1976i c1976i) {
        float f9 = f7 - 0.005f;
        float f10 = f8 - 0.005f;
        float f11 = f7 + 0.005f;
        float f12 = f8 + 0.005f;
        C1976i c1976iA = AbstractC1978k.a();
        EnumC1957G[] enumC1957GArr = EnumC1957G.f20179o;
        if (Float.isNaN(f9) || Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12)) {
            AbstractC1978k.b("Invalid rectangle, make sure no value is NaN");
        }
        if (c1976iA.f20242b == null) {
            c1976iA.f20242b = new RectF();
        }
        RectF rectF = c1976iA.f20242b;
        AbstractC1209k.c(rectF);
        rectF.set(f9, f10, f11, f12);
        RectF rectF2 = c1976iA.f20242b;
        AbstractC1209k.c(rectF2);
        c1976iA.f20241a.addRect(rectF2, Path.Direction.CCW);
        C1976i c1976iA2 = AbstractC1978k.a();
        c1976iA2.getClass();
        Path.Op op = Path.Op.INTERSECT;
        if (!(c1976i instanceof C1976i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = c1976i.f20241a;
        if (!(c1976iA instanceof C1976i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        c1976iA2.f20241a.op(path, c1976iA.f20241a, op);
        boolean zIsEmpty = c1976iA2.f20241a.isEmpty();
        c1976iA2.d();
        c1976iA.d();
        return !zIsEmpty;
    }

    public static final boolean C(float f7, float f8, float f9, float f10, long j3) {
        float f11 = f7 - f9;
        float f12 = f8 - f10;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return ((f12 * f12) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f11 * f11) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final void D(float[] fArr, float[] fArr2) {
        float fT = t(fArr2, 0, fArr, 0);
        float fT2 = t(fArr2, 0, fArr, 1);
        float fT3 = t(fArr2, 0, fArr, 2);
        float fT4 = t(fArr2, 0, fArr, 3);
        float fT5 = t(fArr2, 1, fArr, 0);
        float fT6 = t(fArr2, 1, fArr, 1);
        float fT7 = t(fArr2, 1, fArr, 2);
        float fT8 = t(fArr2, 1, fArr, 3);
        float fT9 = t(fArr2, 2, fArr, 0);
        float fT10 = t(fArr2, 2, fArr, 1);
        float fT11 = t(fArr2, 2, fArr, 2);
        float fT12 = t(fArr2, 2, fArr, 3);
        float fT13 = t(fArr2, 3, fArr, 0);
        float fT14 = t(fArr2, 3, fArr, 1);
        float fT15 = t(fArr2, 3, fArr, 2);
        float fT16 = t(fArr2, 3, fArr, 3);
        fArr[0] = fT;
        fArr[1] = fT2;
        fArr[2] = fT3;
        fArr[3] = fT4;
        fArr[4] = fT5;
        fArr[5] = fT6;
        fArr[6] = fT7;
        fArr[7] = fT8;
        fArr[8] = fT9;
        fArr[9] = fT10;
        fArr[10] = fT11;
        fArr[11] = fT12;
        fArr[12] = fT13;
        fArr[13] = fT14;
        fArr[14] = fT15;
        fArr[15] = fT16;
    }

    public static final AbstractC1368i E(C0377d0 c0377d0, int i7) {
        Object next;
        Iterator<T> it = c0377d0.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Q0.K) ((Map.Entry) next).getKey()).f5831p == i7) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AbstractC1368i) entry.getValue();
        }
        return null;
    }

    public static final String F(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String G(int i7) {
        if (i7 == 0) {
            return "android.widget.Button";
        }
        if (i7 == 1) {
            return "android.widget.CheckBox";
        }
        if (i7 == 3) {
            return "android.widget.RadioButton";
        }
        if (i7 == 5) {
            return "android.widget.ImageView";
        }
        if (i7 == 6) {
            return "android.widget.Spinner";
        }
        if (i7 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final boolean k(Y0.o oVar) {
        Y0.j jVarK = oVar.k();
        return !jVarK.f8473o.c(Y0.t.f8537i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0032, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x005d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.view.View m(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            r0 = 0
            r1 = 1
            r2 = -1
            if (r4 == r1) goto L33
            r1 = 2
            if (r4 == r1) goto L9
            goto L39
        L9:
            int r4 = r5.getNextFocusForwardId()
            if (r4 != r2) goto L10
            goto L39
        L10:
            R0.u r1 = new R0.u
            r2 = 1
            r1.<init>(r4, r2)
            r4 = r0
        L17:
            android.view.View r4 = u(r5, r1, r4)
            if (r4 != 0) goto L32
            if (r5 != r6) goto L20
            goto L32
        L20:
            android.view.ViewParent r4 = r5.getParent()
            if (r4 == 0) goto L31
            boolean r2 = r4 instanceof android.view.View
            if (r2 != 0) goto L2b
            goto L31
        L2b:
            android.view.View r4 = (android.view.View) r4
            r3 = r5
            r5 = r4
            r4 = r3
            goto L17
        L31:
            return r0
        L32:
            return r4
        L33:
            int r4 = r5.getId()
            if (r4 != r2) goto L3a
        L39:
            return r0
        L3a:
            K0.A r4 = new K0.A
            r1 = 9
            r4.<init>(r6, r1, r5)
            r1 = r0
        L42:
            android.view.View r1 = u(r5, r4, r1)
            if (r1 != 0) goto L5d
            if (r5 != r6) goto L4b
            goto L5d
        L4b:
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L5c
            boolean r2 = r1 instanceof android.view.View
            if (r2 != 0) goto L56
            goto L5c
        L56:
            android.view.View r1 = (android.view.View) r1
            r3 = r1
            r1 = r5
            r5 = r3
            goto L42
        L5c:
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.M.m(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public static final boolean n(Y0.o oVar, Resources resources) {
        Object objG = oVar.f8484d.f8473o.g(Y0.t.f8530a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !Y0.r.e(oVar) && (oVar.f8484d.f8475q || (oVar.o() && ((list != null ? (String) Z4.n.r0(list) : null) != null || x(oVar) != null || w(oVar, resources) != null || v(oVar))));
    }

    public static final void o(View view, ArrayList arrayList, boolean z6) {
        t.J j3;
        int i7;
        C1.b bVar;
        boolean z7 = view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z6 || view.isFocusableInTouchMode());
        if (!(view instanceof ViewGroup)) {
            if (z7) {
                arrayList.add(view);
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z8 = viewGroup.getDescendantFocusability() == 131072;
        if (z7 && z8) {
            arrayList.add(view);
        }
        if (viewGroup.getDescendantFocusability() != 393216) {
            int childCount = viewGroup.getChildCount();
            View[] viewArr = new View[childCount];
            for (int i8 = 0; i8 < childCount; i8++) {
                viewArr[i8] = viewGroup.getChildAt(i8);
            }
            C1444F c1444f = AbstractC0416x0.f6639a;
            boolean z9 = viewGroup.getLayoutDirection() == 1;
            if (childCount < 2) {
                i7 = 0;
            } else {
                C1444F c1444f2 = AbstractC0416x0.f6639a;
                int i9 = childCount - c1444f2.f15984b;
                for (int i10 = 0; i10 < i9; i10++) {
                    c1444f2.a(new Rect());
                }
                int i11 = 0;
                while (true) {
                    j3 = AbstractC0416x0.f6642d;
                    if (i11 >= childCount) {
                        break;
                    }
                    View view2 = viewArr[i11];
                    int i12 = AbstractC0416x0.f6640b;
                    AbstractC0416x0.f6640b = i12 + 1;
                    Rect rect = (Rect) c1444f2.e(i12);
                    view2.getDrawingRect(rect);
                    viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                    j3.m(view2, rect);
                    i11++;
                }
                i7 = 0;
                C1.b bVar2 = AbstractC0416x0.f6643e;
                AbstractC1209k.f(bVar2, "comparator");
                if (childCount > 1) {
                    Arrays.sort(viewArr, bVar2);
                }
                Object objG = j3.g(viewArr[0]);
                AbstractC1209k.c(objG);
                int iMax = ((Rect) objG).bottom;
                AbstractC0416x0.f6641c = z9 ? -1 : 1;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    bVar = AbstractC0416x0.f6644f;
                    if (i13 >= childCount) {
                        break;
                    }
                    Object objG2 = j3.g(viewArr[i13]);
                    AbstractC1209k.c(objG2);
                    Rect rect2 = (Rect) objG2;
                    if (rect2.top >= iMax) {
                        if (i13 - i14 > 1) {
                            Z4.l.o0(viewArr, bVar, i14, i13);
                        }
                        iMax = rect2.bottom;
                        i14 = i13;
                    } else {
                        iMax = Math.max(iMax, rect2.bottom);
                    }
                    i13++;
                }
                if (childCount - i14 > 1) {
                    Z4.l.o0(viewArr, bVar, i14, childCount);
                }
                AbstractC0416x0.f6640b = 0;
                j3.a();
            }
            for (int i15 = i7; i15 < childCount; i15++) {
                o(viewArr[i15], arrayList, z6);
            }
        }
        if (z7 && !z8 && size == arrayList.size()) {
            arrayList.add(view);
        }
    }

    public static final void p(H1.e eVar, Y0.o oVar) {
        Object objG = oVar.f8484d.f8473o.g(Y0.t.f8551x);
        if (objG == null) {
            objG = null;
        }
        Y0.g gVar = (Y0.g) objG;
        if (k(oVar)) {
            if (gVar != null && gVar.f8444a == 8) {
                return;
            }
            Y0.w wVar = Y0.i.f8470x;
            t.J j3 = oVar.f8484d.f8473o;
            Object objG2 = j3.g(wVar);
            if (objG2 == null) {
                objG2 = null;
            }
            Y0.a aVar = (Y0.a) objG2;
            if (aVar != null) {
                eVar.a(new H1.d(null, R.id.accessibilityActionPageUp, aVar.f8430a, null));
            }
            Object objG3 = j3.g(Y0.i.f8472z);
            if (objG3 == null) {
                objG3 = null;
            }
            Y0.a aVar2 = (Y0.a) objG3;
            if (aVar2 != null) {
                eVar.a(new H1.d(null, R.id.accessibilityActionPageDown, aVar2.f8430a, null));
            }
            Object objG4 = j3.g(Y0.i.f8471y);
            if (objG4 == null) {
                objG4 = null;
            }
            Y0.a aVar3 = (Y0.a) objG4;
            if (aVar3 != null) {
                eVar.a(new H1.d(null, R.id.accessibilityActionPageLeft, aVar3.f8430a, null));
            }
            Object objG5 = j3.g(Y0.i.f8447A);
            if (objG5 == null) {
                objG5 = null;
            }
            Y0.a aVar4 = (Y0.a) objG5;
            if (aVar4 != null) {
                eVar.a(new H1.d(null, R.id.accessibilityActionPageRight, aVar4.f8430a, null));
            }
        }
    }

    public static final void q(H1.e eVar, Y0.o oVar) {
        if (k(oVar)) {
            Object objG = oVar.f8484d.f8473o.g(Y0.i.h);
            if (objG == null) {
                objG = null;
            }
            Y0.a aVar = (Y0.a) objG;
            if (aVar != null) {
                eVar.a(new H1.d(null, R.id.accessibilityActionSetProgress, aVar.f8430a, null));
            }
        }
    }

    public static final boolean r(Object obj) {
        if (obj instanceof p0.n) {
            p0.n nVar = (p0.n) obj;
            if (nVar.a() == f0.W.f11764q || nVar.a() == f0.W.f11767t || nVar.a() == f0.W.f11765r) {
                Object value = nVar.getValue();
                if (value == null) {
                    return true;
                }
                return r(value);
            }
        } else {
            if ((obj instanceof Y4.c) && (obj instanceof Serializable)) {
                return false;
            }
            Class[] clsArr = f6324a;
            for (int i7 = 0; i7 < 7; i7++) {
                if (clsArr[i7].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int s(float f7) {
        return ((int) (f7 >= 0.0f ? Math.ceil(f7) : Math.floor(f7))) * (-1);
    }

    public static final float t(float[] fArr, int i7, float[] fArr2, int i8) {
        int i9 = i7 * 4;
        return (fArr[i9 + 3] * fArr2[12 + i8]) + (fArr[i9 + 2] * fArr2[8 + i8]) + (fArr[i9 + 1] * fArr2[4 + i8]) + (fArr[i9] * fArr2[i8]);
    }

    public static final View u(View view, InterfaceC1182c interfaceC1182c, View view2) {
        View viewU;
        if (((Boolean) interfaceC1182c.b(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt != view2 && (viewU = u(childAt, interfaceC1182c, view2)) != null) {
                return viewU;
            }
        }
        return null;
    }

    public static final boolean v(Y0.o oVar) {
        Object objG = oVar.f8484d.f8473o.g(Y0.t.f8523I);
        if (objG == null) {
            objG = null;
        }
        EnumC0510a enumC0510a = (EnumC0510a) objG;
        Y0.w wVar = Y0.t.f8551x;
        t.J j3 = oVar.f8484d.f8473o;
        Object objG2 = j3.g(wVar);
        if (objG2 == null) {
            objG2 = null;
        }
        Y0.g gVar = (Y0.g) objG2;
        boolean z6 = enumC0510a != null;
        Object objG3 = j3.g(Y0.t.f8522H);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (gVar != null && gVar.f8444a == 4)) {
            return z6;
        }
        return true;
    }

    public static final String w(Y0.o oVar, Resources resources) {
        int iQ;
        Object objG = oVar.f8484d.f8473o.g(Y0.t.f8531b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        Y0.w wVar = Y0.t.f8523I;
        Y0.j jVar = oVar.f8484d;
        t.J j3 = jVar.f8473o;
        Object objG2 = j3.g(wVar);
        if (objG2 == null) {
            objG2 = null;
        }
        EnumC0510a enumC0510a = (EnumC0510a) objG2;
        Object objG3 = j3.g(Y0.t.f8551x);
        if (objG3 == null) {
            objG3 = null;
        }
        Y0.g gVar = (Y0.g) objG3;
        if (enumC0510a != null) {
            int iOrdinal = enumC0510a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new A2.W();
                    }
                    if (objG == null) {
                        objG = resources.getString(yos.music.player.R.string.indeterminate);
                    }
                } else if (gVar != null && gVar.f8444a == 2 && objG == null) {
                    objG = resources.getString(yos.music.player.R.string.state_off);
                }
            } else if (gVar != null && gVar.f8444a == 2 && objG == null) {
                objG = resources.getString(yos.music.player.R.string.state_on);
            }
        }
        Object objG4 = j3.g(Y0.t.f8522H);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((gVar == null || gVar.f8444a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(yos.music.player.R.string.selected) : resources.getString(yos.music.player.R.string.not_selected);
            }
        }
        Object objG5 = j3.g(Y0.t.f8532c);
        if (objG5 == null) {
            objG5 = null;
        }
        Y0.f fVar = (Y0.f) objG5;
        if (fVar != null) {
            if (fVar != Y0.f.f8441c) {
                if (objG == null) {
                    C1420a c1420a = fVar.f8443b;
                    float f7 = c1420a.f15780b;
                    float f8 = c1420a.f15779a;
                    float f9 = f7 - f8 == 0.0f ? 0.0f : (fVar.f8442a - f8) / (f7 - f8);
                    if (f9 < 0.0f) {
                        f9 = 0.0f;
                    }
                    if (f9 > 1.0f) {
                        f9 = 1.0f;
                    }
                    if (f9 == 0.0f) {
                        iQ = 0;
                    } else {
                        iQ = 100;
                        if (f9 != 1.0f) {
                            iQ = i6.h.q(Math.round(f9 * 100), 1, 99);
                        }
                    }
                    objG = resources.getString(yos.music.player.R.string.template_percent, Integer.valueOf(iQ));
                }
            } else if (objG == null) {
                objG = resources.getString(yos.music.player.R.string.in_progress);
            }
        }
        Y0.w wVar2 = Y0.t.f8519E;
        if (j3.c(wVar2)) {
            Y0.j jVarK = new Y0.o(oVar.f8481a, true, oVar.f8483c, jVar).k();
            Y0.w wVar3 = Y0.t.f8530a;
            t.J j7 = jVarK.f8473o;
            Object objG6 = j7.g(wVar3);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = j7.g(Y0.t.f8515A);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = j7.g(wVar2);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(yos.music.player.R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final C0622g x(Y0.o oVar) {
        Y0.j jVar = oVar.f8484d;
        Y0.w wVar = Y0.t.f8530a;
        C0622g c0622g = (C0622g) Y0.r.d(jVar, Y0.t.f8519E);
        List list = (List) Y0.r.d(oVar.f8484d, Y0.t.f8515A);
        return c0622g == null ? list != null ? (C0622g) Z4.n.r0(list) : null : c0622g;
    }

    public static boolean y() {
        try {
            if (C0415x.f6555V0 == null) {
                C0415x.f6555V0 = Class.forName("android.os.SystemProperties");
            }
            if (C0415x.f6556W0 == null) {
                Class cls = C0415x.f6555V0;
                C0415x.f6556W0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = C0415x.f6556W0;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return AbstractC1209k.a(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final C0613I z(Y0.j jVar) {
        InterfaceC1182c interfaceC1182c;
        ArrayList arrayList = new ArrayList();
        Object objG = jVar.f8473o.g(Y0.i.f8449a);
        if (objG == null) {
            objG = null;
        }
        Y0.a aVar = (Y0.a) objG;
        if (aVar == null || (interfaceC1182c = (InterfaceC1182c) aVar.f8431b) == null || !((Boolean) interfaceC1182c.b(arrayList)).booleanValue()) {
            return null;
        }
        return (C0613I) arrayList.get(0);
    }
}
