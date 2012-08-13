/*
 * Copyright 2011 Future Systems
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.krakenapps.logdb.query;

import java.util.Comparator;
import java.util.Date;

import org.krakenapps.logdb.query.command.NumberUtil;

public class ObjectComparator implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
		if (o1 == null && o2 == null)
			return 0;
		else if (o1 == null && o2 != null)
			return 1;
		else if (o1 != null && o2 == null)
			return -1;

		if (o1.equals(o2))
			return 0;
		else {
			if (NumberUtil.getClass(o1) != null && NumberUtil.getClass(o2) != null) {
				long cmp = NumberUtil.sub(o1, o2).longValue();
				return (cmp == 0) ? 0 : ((cmp > 0) ? 1 : -1);
			}

			if (!o1.getClass().equals(o2.getClass()))
				return o1.toString().compareTo(o2.toString());

			if (o1 instanceof String)
				return ((String) o1).compareTo((String) o2);
			else if (o1 instanceof Date)
				return ((Date) o1).compareTo((Date) o2);
		}

		return -1;
	}
}
