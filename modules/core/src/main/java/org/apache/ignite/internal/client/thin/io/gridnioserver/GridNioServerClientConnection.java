/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
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

package org.apache.ignite.internal.client.thin.io.gridnioserver;

import org.apache.ignite.internal.client.thin.io.ClientConnection;
import org.apache.ignite.internal.util.nio.GridNioSession;
import org.apache.ignite.internal.util.nio.GridNioSessionMetaKey;

import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

class GridNioServerClientConnection implements ClientConnection {
    /** */
    private static final int SES_META_CONN = GridNioSessionMetaKey.nextUniqueKey();

    /** */
    private final GridNioSession ses;

    public GridNioServerClientConnection(GridNioSession ses) {
        assert ses != null;

        this.ses = ses;
        ses.addMeta(SES_META_CONN, this);
    }

    /** {@inheritDoc} */
    @Override public CompletableFuture<Void> sendAsync(ByteBuffer message) {
        return null;
    }

    /** {@inheritDoc} */
    @Override public void setMessageHandler(Consumer<ByteBuffer> handler) {

    }

    /** {@inheritDoc} */
    @Override public void close() {

    }
}
