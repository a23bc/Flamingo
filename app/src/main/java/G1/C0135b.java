package G1;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import yos.music.player.R;

/* JADX INFO: renamed from: G1.b */
/* JADX INFO: loaded from: classes.dex */
public class C0135b {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f2688c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f2689a;

    /* JADX INFO: renamed from: b */
    public final C0134a f2690b;

    public C0135b() {
        this(f2688c);
    }

    public A.b a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2689a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new A.b(22, accessibilityNodeProvider);
        }
        return null;
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.f2689a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, H1.e eVar) {
        this.f2689a.onInitializeAccessibilityNodeInfo(view, eVar.f2969a);
    }

    public boolean d(View view, int i7, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i8 = 0; i8 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((H1.d) list.get(i8)).f2966a).getId() != i7; i8++) {
        }
        boolean zPerformAccessibilityAction = this.f2689a.performAccessibilityAction(view, i7, bundle);
        if (zPerformAccessibilityAction || i7 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i9 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i9)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i10 = 0; clickableSpanArr != null && i10 < clickableSpanArr.length; i10++) {
                if (clickableSpan.equals(clickableSpanArr[i10])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    public C0135b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2689a = accessibilityDelegate;
        this.f2690b = new C0134a(this);
    }
}
