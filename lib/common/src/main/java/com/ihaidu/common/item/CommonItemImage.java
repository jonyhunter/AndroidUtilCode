package com.ihaidu.common.item;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import com.blankj.utilcode.util.StringUtils;
import com.blankj.utilcode.util.Utils;
import com.ihaidu.base.rv.ItemViewHolder;
import com.ihaidu.common.R;

/**
 * <pre>
 *     author: blankj
 *     blog  : http://blankj.com
 *     time  : 2019/10/31
 *     desc  :
 * </pre>
 */
public class CommonItemImage extends CommonItem {

    private CharSequence              mTitle;
    private Utils.Consumer<ImageView> mSetImageConsumer;

    public CommonItemImage(@StringRes int title, @NonNull Utils.Consumer<ImageView> setImageConsumer) {
        this(StringUtils.getString(title), setImageConsumer);
    }

    public CommonItemImage(@NonNull CharSequence title, @NonNull Utils.Consumer<ImageView> setImageConsumer) {
        super(R.layout.common_item_title_image);
        mTitle = title;
        mSetImageConsumer = setImageConsumer;
    }

    @Override
    public void bind(@NonNull ItemViewHolder holder, int position) {
        super.bind(holder, position);
        final TextView titleTv = holder.findViewById(R.id.commonItemTitleTv);

        titleTv.setText(mTitle);
        ImageView commonItemIv = holder.findViewById(R.id.commonItemIv);
        mSetImageConsumer.accept(commonItemIv);
    }
}
