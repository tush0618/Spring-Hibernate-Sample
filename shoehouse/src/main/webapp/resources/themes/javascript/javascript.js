function cardpayment()
{
	var creditpay = '<iframe width="500" height="500" style="border: none;" src="../html/card-payment.html"></iframe>'
//		var creditpay = '<div class="card-header">'+
//			'+Credit Card+'
//			'</div>';
//	var creditpay = '<div class="card-header"><span class="lb">CREDIT / DEBIT CARD</span></div><div class="card-form">
//	                      <div class="row">\
//	                                  <label>Card Number*</label>
//	                                  <span class="card-num-wrap">
//	                                  	<input
//	                                         class="card-num-input" placeholder="Card Number" type="tel"
//	                                         maxlength="19" autocomplete="off">
//	                                  </span>
//	                           </div>
//		</div>';
//	                           <div class="row">
//	                                  <label>Name On Card*</label> <input class="name_on_card"
//	                                         placeholder="Name on Card" type="text" autocomplete="off"
//	                                         name="bill_name">
//	                           </div>
//	                           <div class="row expiry">
//	                                  <div class="col month">
//	                                         <label>Expiry Month*</label> <select name="card_month">
//	                                                <option value>Expiry Month</option>
//	                                                <option value="01">01</option>
//	                                                <option value="02">02</option>
//	                                                <option value="03">03</option>
//	                                                <option value="04">04</option>
//	                                                <option value="05">05</option>
//	                                                <option value="06">06</option>
//	                                                <option value="07">07</option>
//	                                                <option value="08">08</option>
//	                                                <option value="09">09</option>
//	                                                <option value="10">10</option>
//	                                                <option value="11">11</option>
//	                                                <option value="12">12</option>
//	                                         </select>
//	                                  </div>
//	                                  <div class="col year">
//	                                         <label>Expiry Year</label> <select name="card_year">
//	                                                <option value="">Expiry Year*</option>
//	                                                <option value="16">2016</option>
//	                                                <option value="17">2017</option>
//	                                                <option value="18">2018</option>
//	                                                <option value="19">2019</option>
//	                                                <option value="20">2020</option>
//	                                                <option value="21">2021</option>
//	                                                <option value="22">2022</option>
//	                                                <option value="23">2023</option>
//	                                                <option value="24">2024</option>
//	                                                <option value="25">2025</option>
//	                                                <option value="26">2026</option>
//	                                                <option value="27">2027</option>
//	                                                <option value="28">2028</option>
//	                                                <option value="29">2029</option>
//	                                                <option value="30">2030</option>
//	                                                <option value="31">2031</option>
//	                                                <option value="32">2032</option>
//	                                                <option value="33">2033</option>
//	                                                <option value="34">2034</option>
//	                                                <option value="35">2035</option>
//	                                                <option value="36">2036</option>
//	                                                <option value="37">2037</option>
//	                                                <option value="38">2038</option>
//	                                                <option value="39">2039</option>
//	                                                <option value="40">2040</option>
//	                                                <option value="41">2041</option>
//	                                                <option value="42">2042</option>
//	                                                <option value="43">2043</option>
//	                                                <option value="44">2044</option>
//	                                                <option value="45">2045</option>
//	                                                <option value="46">2046</option>
//	                                         </select>
//	                                  </div>
//	                           </div>
//	                           <div class="row">
//	                                  <label class="cvv_label">CVV*</label>
//	                                  <input class="cvv_box" placeholder="CVV"
//	                                         maxlength="3" size="4" type="password" autocomplete="off"
//	                                         name="cvv_code">
//	                                  <span class="cvv-help-text">
//	                                        <span  class="cvv-icon"></span>
//	                                               Last 3 digits printed on the back of the card
//	                                  </span>
//	                           </div>
//	                           <div class="pay-btn-wrap">
//	                                  <button type="submit" class="primary-btn">PAY NOW</button>
//	                           </div>
//	                     </div>
//	              </div>
//	       </div>;
	
	document.getElementById("payment-details").innerHTML = creditpay;
}