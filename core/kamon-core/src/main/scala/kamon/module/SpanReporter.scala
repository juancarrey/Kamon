/*
 * Copyright 2013-2021 The Kamon Project <https://kamon.io>
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

package kamon.module

import kamon.trace.Span

/**
  * Modules implementing this trait will get registered for periodically receiving span batches. The frequency of the
  * span batches is controlled by the kamon.trace.tick-interval setting.
  */
trait SpanReporter extends Module {
  def reportSpans(spans: Seq[Span.Finished]): Unit
}
