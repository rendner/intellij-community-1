// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.ide.plugins;

import com.intellij.util.xmlb.annotations.Tag;

public class OptimizedPluginBean {
  @Tag(value = "is-internal", textIfEmpty = "true")
  public boolean isInternal;
}