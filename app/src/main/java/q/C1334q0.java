package q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;
import yos.music.player.R;

/* JADX INFO: renamed from: q.q0 */
/* JADX INFO: loaded from: classes.dex */
public class C1334q0 extends ListView {

    /* JADX INFO: renamed from: o */
    public final Rect f15372o;

    /* JADX INFO: renamed from: p */
    public int f15373p;

    /* JADX INFO: renamed from: q */
    public int f15374q;

    /* JADX INFO: renamed from: r */
    public int f15375r;

    /* JADX INFO: renamed from: s */
    public int f15376s;

    /* JADX INFO: renamed from: t */
    public int f15377t;

    /* JADX INFO: renamed from: u */
    public C1330o0 f15378u;

    /* JADX INFO: renamed from: v */
    public boolean f15379v;

    /* JADX INFO: renamed from: w */
    public final boolean f15380w;

    /* JADX INFO: renamed from: x */
    public boolean f15381x;

    /* JADX INFO: renamed from: y */
    public K1.d f15382y;

    /* JADX INFO: renamed from: z */
    public B3.c f15383z;

    public C1334q0(Context context, boolean z6) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f15372o = new Rect();
        this.f15373p = 0;
        this.f15374q = 0;
        this.f15375r = 0;
        this.f15376s = 0;
        this.f15380w = z6;
        setCacheColorHint(0);
    }

    public final int a(int i7, int i8) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i9 = 0;
        View view = null;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = adapter.getItemViewType(i10);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i10, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            view.measure(i7, i11 > 0 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i10 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i8) {
                return i8;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C1334q0.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f15372o;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f15383z != null) {
            return;
        }
        super.drawableStateChanged();
        C1330o0 c1330o0 = this.f15378u;
        if (c1330o0 != null) {
            c1330o0.f15363p = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f15381x && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f15380w || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f15380w || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f15380w || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f15380w && this.f15379v) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f15383z = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f15383z == null) {
            B3.c cVar = new B3.c(10, this);
            this.f15383z = cVar;
            post(cVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i7 < 30 || !AbstractC1326m0.f15357d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC1326m0.f15354a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC1326m0.f15355b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC1326m0.f15356c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e7) {
                        e7.printStackTrace();
                    } catch (InvocationTargetException e8) {
                        e8.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f15381x && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f15377t = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        B3.c cVar = this.f15383z;
        if (cVar != null) {
            C1334q0 c1334q0 = (C1334q0) cVar.f821p;
            c1334q0.f15383z = null;
            c1334q0.removeCallbacks(cVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z6) {
        this.f15379v = z6;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1330o0 c1330o0 = null;
        if (drawable != null) {
            C1330o0 c1330o02 = new C1330o0();
            Drawable drawable2 = c1330o02.f15362o;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c1330o02.f15362o = drawable;
            drawable.setCallback(c1330o02);
            c1330o02.f15363p = true;
            c1330o0 = c1330o02;
        }
        this.f15378u = c1330o0;
        super.setSelector(c1330o0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f15373p = rect.left;
        this.f15374q = rect.top;
        this.f15375r = rect.right;
        this.f15376s = rect.bottom;
    }
}
