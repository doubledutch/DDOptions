/*
 * Copyright [2015] [DoubleDutch]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.doubledutch.options.accessor;

import me.doubledutch.options.Result;

import java.lang.reflect.Field;

import static me.doubledutch.options.Result.success;

public class BooleanFieldAccessor extends AbstractFieldAccessor<Boolean> {
    @Override
    public boolean supports(String type) {
        return "boolean".equalsIgnoreCase(type);
    }

    @Override
    protected Boolean convertValue(String value) {
        return true;
    }

    @Override
    protected Result setDirectlyOnField(Object target, Field field, Boolean value) throws IllegalAccessException {
        field.setBoolean(target, value);
        return success();
    }
}
