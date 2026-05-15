package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends C1334q0 {

    /* JADX INFO: renamed from: A */
    public final int f15169A;

    /* JADX INFO: renamed from: B */
    public final int f15170B;

    /* JADX INFO: renamed from: C */
    public E0 f15171C;

    /* JADX INFO: renamed from: D */
    public p.n f15172D;

    public H0(Context context, boolean z6) {
        super(context, z6);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f15169A = 21;
            this.f15170B = 22;
        } else {
            this.f15169A = 22;
            this.f15170B = 21;
        }
    }

    @Override // q.C1334q0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        p.i iVar;
        int headersCount;
        int iPointToPosition;
        int i7;
        if (this.f15171C != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                iVar = (p.i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (p.i) adapter;
                headersCount = 0;
            }
            p.n item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i7 = iPointToPosition - headersCount) < 0 || i7 >= iVar.getCount()) ? null : iVar.getItem(i7);
            p.n nVar = this.f15172D;
            if (nVar != item) {
                p.l lVar = iVar.f14808a;
                if (nVar != null) {
                    this.f15171C.g(lVar, nVar);
                }
                this.f15172D = item;
                if (item != null) {
                    this.f15171C.y(lVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i7 == this.f15169A) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i7 != this.f15170B) {
            return super.onKeyDown(i7, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (p.i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (p.i) adapter).f14808a.c(false);
        return true;
    }

    public void setHoverListener(E0 e02) {
        this.f15171C = e02;
    }

    @Override // q.C1334q0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
