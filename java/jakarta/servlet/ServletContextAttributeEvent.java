/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jakarta.servlet;

import java.io.Serial;

/**
 * This is the event class for notifications about changes to the attributes of the servlet context of a web
 * application.
 *
 * @see ServletContextAttributeListener
 *
 * @since Servlet 2.3
 */
public class ServletContextAttributeEvent extends ServletContextEvent {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Attribute name.
     */
    private final String name;

    /**
     * Attribute value.
     */
    private final Object value;

    /**
     * Construct a ServletContextAttributeEvent from the given context for the given attribute name and attribute value.
     *
     * @param source The ServletContext associated with this attribute event
     * @param name   The name of the servlet context attribute
     * @param value  The value of the servlet context attribute
     */
    public ServletContextAttributeEvent(ServletContext source, String name, Object value) {
        super(source);
        this.name = name;
        this.value = value;
    }

    /**
     * Return the name of the attribute that changed on the ServletContext.
     *
     * @return The name of the attribute that changed
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the value of the attribute that has been added, removed, or replaced.
     *
     * @return If the attribute was added, this is the value of the attribute. If the attribute was removed, this is the
     *             value of the removed attribute. If the attribute was replaced, this is the old value of the
     *             attribute.
     */
    public Object getValue() {
        return this.value;
    }
}
