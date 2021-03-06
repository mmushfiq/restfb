/**
 * Copyright (c) 2010-2016 Mark Allen, Norbert Bartels.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.restfb.types;

import com.restfb.Facebook;

import lombok.Getter;
import lombok.Setter;

public class Hours extends NamedFacebookType {

  @Getter
  @Setter
  @Facebook("mon_1_open")
  private String monday1open;

  @Getter
  @Setter
  @Facebook("mon_1_close")
  private String monday1close;

  @Getter
  @Setter
  @Facebook("tue_1_open")
  private String tuesday1open;

  @Getter
  @Setter
  @Facebook("tue_1_close")
  private String tuesday1close;

  @Getter
  @Setter
  @Facebook("wed_1_open")
  private String wednesday1open;

  @Getter
  @Setter
  @Facebook("wed_1_close")
  private String wednesday1close;

  @Getter
  @Setter
  @Facebook("thu_1_open")
  private String thursday1open;

  @Getter
  @Setter
  @Facebook("thu_1_close")
  private String thursday1close;

  @Getter
  @Setter
  @Facebook("fri_1_open")
  private String friday1open;

  @Getter
  @Setter
  @Facebook("fri_1_close")
  private String friday1close;

  @Getter
  @Setter
  @Facebook("sat_1_open")
  private String saturday1open;

  @Getter
  @Setter
  @Facebook("sat_1_close")
  private String saturday1close;

  @Getter
  @Setter
  @Facebook("sun_1_open")
  private String sunday1open;

  @Getter
  @Setter
  @Facebook("sun_1_close")
  private String sunday1close;

  @Getter
  @Setter
  @Facebook("mon_2_open")
  private String monday2open;

  @Getter
  @Setter
  @Facebook("mon_2_close")
  private String monday2close;

  @Getter
  @Setter
  @Facebook("tue_2_open")
  private String tuesday2open;

  @Getter
  @Setter
  @Facebook("tue_2_close")
  private String tuesday2close;

  @Getter
  @Setter
  @Facebook("wed_2_open")
  private String wednesday2open;

  @Getter
  @Setter
  @Facebook("wed_2_close")
  private String wednesday2close;

  @Getter
  @Setter
  @Facebook("thu_2_open")
  private String thursday2open;

  @Getter
  @Setter
  @Facebook("thu_2_close")
  private String thursday2close;

  @Getter
  @Setter
  @Facebook("fri_2_open")
  private String friday2open;

  @Getter
  @Setter
  @Facebook("fri_2_close")
  private String friday2close;

  @Getter
  @Setter
  @Facebook("sat_2_open")
  private String saturday2open;

  @Getter
  @Setter
  @Facebook("sat_2_close")
  private String saturday2close;

  @Getter
  @Setter
  @Facebook("sun_2_open")
  private String sunday2open;

  @Getter
  @Setter
  @Facebook("sun_2_close")
  private String sunday2close;

  private static final long serialVersionUID = 1L;
}
