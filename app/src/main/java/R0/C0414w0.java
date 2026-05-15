package R0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;
import m5.AbstractC1209k;
import w0.C1696d;
import x0.C1893c;
import y0.AbstractC1959I;

/* JADX INFO: renamed from: R0.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0414w0 {

    /* JADX INFO: renamed from: f */
    public static final K5.c f6549f = new K5.c(2);

    /* JADX INFO: renamed from: a */
    public final Rect f6550a = new Rect();

    /* JADX INFO: renamed from: b */
    public final Rect f6551b = new Rect();

    /* JADX INFO: renamed from: c */
    public final Rect f6552c = new Rect();

    /* JADX INFO: renamed from: d */
    public final C0412v0 f6553d = new C0412v0(new A2.I(12, this));

    /* JADX INFO: renamed from: e */
    public final ArrayList f6554e = new ArrayList();

    public static void d(ViewGroup viewGroup, Rect rect) {
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        int width = viewGroup.getWidth() + viewGroup.getScrollX();
        rect.set(width, height, width, height);
    }

    public final View a(int i7, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        int iIndexOf;
        int iLastIndexOf;
        int i8;
        Rect rect2 = this.f6550a;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 17 || i7 == 33) {
                    d(viewGroup, rect2);
                } else if (i7 == 66 || i7 == 130) {
                    int scrollY = viewGroup.getScrollY();
                    int scrollX = viewGroup.getScrollX();
                    rect2.set(scrollX, scrollY, scrollX, scrollY);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                d(viewGroup, rect2);
            } else {
                int scrollY2 = viewGroup.getScrollY();
                int scrollX2 = viewGroup.getScrollX();
                rect2.set(scrollX2, scrollY2, scrollX2, scrollY2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            int scrollY3 = viewGroup.getScrollY();
            int scrollX3 = viewGroup.getScrollX();
            rect2.set(scrollX3, scrollY3, scrollX3, scrollY3);
        } else {
            d(viewGroup, rect2);
        }
        if (i7 != 1 && i7 != 2) {
            if (i7 == 17 || i7 == 33 || i7 == 66 || i7 == 130) {
                return c(i7, rect2, view, viewGroup, arrayList);
            }
            throw new IllegalArgumentException(n1.c.s(i7, "Unknown direction: "));
        }
        C0412v0 c0412v0 = this.f6553d;
        try {
            c0412v0.a(arrayList, viewGroup);
            Collections.sort(arrayList, c0412v0);
            c0412v0.f6544r.a();
            c0412v0.f6543q.b();
            c0412v0.f6545s.a();
            c0412v0.f6542p.a();
            int size = arrayList.size();
            View viewC = null;
            if (size < 2) {
                return null;
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 17 || i7 == 33 || i7 == 66 || i7 == 130) {
                        viewC = c(i7, this.f6550a, view, viewGroup, arrayList);
                    }
                } else if (size >= 2) {
                    viewC = (view == null || (iLastIndexOf = arrayList.lastIndexOf(view)) < 0 || (i8 = iLastIndexOf + 1) >= size) ? (View) arrayList.get(0) : (View) arrayList.get(i8);
                }
            } else if (size >= 2) {
                viewC = (view == null || (iIndexOf = arrayList.indexOf(view)) <= 0) ? (View) arrayList.get(size - 1) : (View) arrayList.get(iIndexOf - 1);
            }
            return viewC == null ? (View) arrayList.get(size - 1) : viewC;
        } catch (Throwable th) {
            c0412v0.f6544r.a();
            c0412v0.f6543q.b();
            c0412v0.f6545s.a();
            c0412v0.f6542p.a();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View b(int i7, View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View viewA = null;
        if (view == null || view == viewGroup) {
            viewGroup2 = viewGroup;
        } else {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent != viewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                } else {
                    if (viewGroup3 == null) {
                        break;
                    }
                    viewGroup2 = viewGroup3;
                }
            }
            viewGroup2 = viewGroup;
        }
        View viewM = M.m(i7, view, viewGroup2);
        int i8 = true;
        View viewM2 = viewM;
        while (viewM != null) {
            if (viewM.isFocusable() && viewM.getVisibility() == 0 && (!viewM.isInTouchMode() || viewM.isFocusableInTouchMode())) {
                viewA = viewM;
                break;
            }
            viewM = M.m(i7, viewM, viewGroup2);
            int i9 = i8 ^ true;
            if (i8 == false) {
                viewM2 = viewM2 != null ? M.m(i7, viewM2, viewGroup2) : null;
                if (viewM2 == viewM) {
                    break;
                }
            }
            i8 = i9;
        }
        if (viewA != null) {
            return viewA;
        }
        ArrayList<View> arrayList = this.f6554e;
        try {
            arrayList.clear();
            if (Build.VERSION.SDK_INT < 26) {
                M.o(viewGroup2, arrayList, viewGroup2.isInTouchMode());
            } else {
                viewGroup2.addFocusables(arrayList, i7, viewGroup2.isInTouchMode() ? 1 : 0);
            }
            if (!arrayList.isEmpty()) {
                viewA = a(i7, null, view, viewGroup2, arrayList);
            }
            arrayList.clear();
            return viewA;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final View c(int i7, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        Rect rect2 = this.f6551b;
        rect2.set(rect);
        if (i7 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i7 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i7 == 66) {
            rect2.offset((-rect.width()) - 1, 0);
        } else if (i7 == 130) {
            rect2.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i8 = 0; i8 < size; i8++) {
            View view3 = (View) arrayList.get(i8);
            if (!AbstractC1209k.a(view3, view) && !AbstractC1209k.a(view3, viewGroup)) {
                Rect rect3 = this.f6552c;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                C1893c c1893cZ = AbstractC1959I.z(rect3);
                C1893c c1893cZ2 = AbstractC1959I.z(rect2);
                C1893c c1893cZ3 = AbstractC1959I.z(rect);
                C1696d c1696dD = w0.f.D(i7);
                if (w0.f.o(c1893cZ, c1893cZ2, c1893cZ3, c1696dD != null ? c1696dD.f18776a : 1)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }
}
