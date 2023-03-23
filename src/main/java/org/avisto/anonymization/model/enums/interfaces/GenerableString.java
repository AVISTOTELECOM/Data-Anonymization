/*
 * Anonymization - This library has for main purpose to allow anonymization of Object by using annotation
 * Copyright © 2023 Advans-group (zack.de-saint-pern@advans-group.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.avisto.anonymization.model.enums.interfaces;

import com.github.curiousoddman.rgxgen.RgxGen;

public interface GenerableString {
    <T> T getRandomValue(int minLength, int maxLength, String path, String[] possibleValues, RgxGen generator);
}
