/*
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.nexial.core.plugins.ws;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpUriRequest;
import org.nexial.core.model.ExecutionContext;

/**
 *
 */
public class DeleteRequest extends GetRequest {

    DeleteRequest(ExecutionContext context) {
        super(context);
        method = "DELETE";
    }

    @Override
    protected HttpUriRequest prepRequest(RequestConfig requestConfig) {
        if (StringUtils.isNotBlank(getQueryString())) { url += "?" + getQueryString(); }

        HttpDelete http = new HttpDelete(url);
        http.setConfig(requestConfig);

        setRequestHeaders(http);

        return http;
    }


}
