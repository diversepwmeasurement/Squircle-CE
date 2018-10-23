/*
 * Copyright (C) 2018 Light Team Software
 *
 * This file is part of ModPE IDE.
 *
 * ModPE IDE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ModPE IDE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package com.KillerBLS.modpeide.dialog.search;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.KillerBLS.modpeide.R;
import com.KillerBLS.modpeide.utils.commons.EditorDelegate;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DialogFind extends MaterialDialog {

    private DialogFind(Builder builder) {
        super(builder);
    }

    public static class Builder extends MaterialDialog.Builder {

        @BindView(R.id.field_input)
        TextInputEditText input;
        @BindView(R.id.matchCase)
        CheckBox matchCase;
        @BindView(R.id.regExp)
        CheckBox regExp;
        @BindView(R.id.wordOnly)
        CheckBox wordOnly;

        public Builder(@NonNull Context context, EditorDelegate editorDelegate) {
            super(context);
            title(R.string.dialog_title_find);
            positiveText(R.string.action_apply);
            negativeText(R.string.action_cancel);
            customView(R.layout.dialog_find, true);
            onPositive((dialog, which) -> {
                String inputSearch = input.getText().toString();
                if(!TextUtils.isEmpty(inputSearch)) {
                    editorDelegate.notifyFindClicked(inputSearch, matchCase.isChecked(),
                            regExp.isChecked(), wordOnly.isChecked());
                }
                Toast.makeText(context, R.string.message_done, Toast.LENGTH_SHORT).show();
            });
        }

        @Override
        public DialogFind build() {
            return new DialogFind(this);
        }

        @Override
        public DialogFind show() {
            DialogFind dialog = build();
            View customView = dialog.getCustomView();
            assert customView != null;
            ButterKnife.bind(this, customView);
            dialog.show();
            return dialog;
        }
    }
}