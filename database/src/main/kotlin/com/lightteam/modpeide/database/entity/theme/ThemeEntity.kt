/*
 * Licensed to the Light Team Software (Light Team) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The Light Team licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lightteam.modpeide.database.entity.theme

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.lightteam.modpeide.database.utils.Tables

@Entity(tableName = Tables.THEMES)
data class ThemeEntity(
    @PrimaryKey
    @ColumnInfo(name = "uuid")
    val uuid: String,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "author")
    val author: String,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "is_external")
    val isExternal: Boolean,
    @ColumnInfo(name = "is_paid")
    val isPaid: Boolean,
    @ColumnInfo(name ="text_color")
    val textColor: String,
    @ColumnInfo(name ="background_color")
    val backgroundColor: String,
    @ColumnInfo(name ="gutter_color")
    val gutterColor: String,
    @ColumnInfo(name ="gutter_divider_color")
    val gutterDividerColor: String,
    @ColumnInfo(name ="gutter_current_line_number_color")
    val gutterCurrentLineNumberColor: String,
    @ColumnInfo(name ="gutter_text_color")
    val gutterTextColor: String,
    @ColumnInfo(name ="selected_line_color")
    val selectedLineColor: String,
    @ColumnInfo(name ="selection_color")
    val selectionColor: String,
    @ColumnInfo(name ="suggestion_match_color")
    val suggestionMatchColor: String,
    @ColumnInfo(name ="search_background_color")
    val searchBackgroundColor: String,
    @ColumnInfo(name ="bracket_background_color")
    val bracketBackgroundColor: String,
    @ColumnInfo(name ="number_color")
    val numberColor: String,
    @ColumnInfo(name ="operator_color")
    val operatorColor: String,
    @ColumnInfo(name ="bracket_color")
    val bracketColor: String,
    @ColumnInfo(name ="keyword_color")
    val keywordColor: String,
    @ColumnInfo(name ="type_color")
    val typeColor: String,
    @ColumnInfo(name ="lang_const_color")
    val langConstColor: String,
    @ColumnInfo(name ="method_color")
    val methodColor: String,
    @ColumnInfo(name ="string_color")
    val stringColor: String,
    @ColumnInfo(name ="comment_color")
    val commentColor: String
)