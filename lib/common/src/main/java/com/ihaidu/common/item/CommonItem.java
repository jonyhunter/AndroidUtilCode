package com.ihaidu.common.item;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;

import com.blankj.utilcode.util.ColorUtils;
import com.ihaidu.base.rv.BaseItem;
import com.ihaidu.base.rv.ItemViewHolder;
import com.ihaidu.common.R;

/**
 * <pre>
 *     author: blankj
 *     blog  : http://blankj.com
 *     time  : 2019/10/25
 *     desc  :
 * </pre>
 */
public class CommonItem<T extends BaseItem> extends BaseItem<T> {

    private int backgroundColor = ColorUtils.getColor(R.color.lightGray);

    public CommonItem(int layoutId) {
        super(layoutId);
    }

    @CallSuper
    @Override
    public void bind(@NonNull final ItemViewHolder holder, int position) {
        holder.itemView.setBackgroundColor(backgroundColor);
    }

    public CommonItem<T> setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }
}
