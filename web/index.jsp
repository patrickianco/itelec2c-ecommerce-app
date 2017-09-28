<html>
    <head>
         <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
         <link rel="stylesheet" type="text/css" href="style.css">
         
    </head>
    <body style="background-color: #4d648d; color: #eef5f8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <div class="container-fluid" style="padding-bottom: 50px;">
          <div class="row hdr-logo">
            <div class="col-xs-1 col-xs-offset-5" style="padding: 10px 0;">
                <img src="logo.png" class="logo">
            </div>
          </div>
          <form action="processPetSelection.html" method ="post" id="petForm">
          <div class="row cont-choose">
            <div class="col-xs-4 col-xs-offset-1">
              <h1>Please Choose a Pet</h1>
            </div>
          </div>
          <!-- ANIMAL BUTTON ROW -->
          <div class="row cont-buttons">
            <div class="col-xs-4 col-xs-offset-1">
                <label>
                    <input type="radio" name="selectedPet" class="gold" id="link_1" value="Dog" />
                    <img src="dogbtn.jpg" class="imgbtn img-responsive">
                </label>
            </div>
            <div class="col-xs-4 col-xs-offset-1">
                <label>
                    <input type="radio" name="selectedPet" class="gold" id="link_2" value="Cat" />
                    <img src="catbtn.jpg" class="imgbtn img-responsive">
                </label>
            </div>
          </div>
          <!-- BREED ROW -->
          <div class="row cont-breeds">
            <div class="link_1 col-xs-4 col-xs-offset-1 cont-breeds" style="display:none">
              <div class="row">
                <div class="col-xs-12">
                    <h1>Please Choose a Breed</h1>
                </div>
              </div>
              <div class="row">
                <div class="col-xs-4">
                  <label>
                      <input type="radio" name="selectedBreed" value="Corgi" />
                      <img src="Corgi.jpg" class="pet">
                      <p>Pembroke Welsh Corgi</p>
                  </label>
                </div>
                <div class="col-xs-4">
                  <label>
                      <input type="radio" name="selectedBreed" value="GermanShepherd" />
                      <img src="German Shepherd.jpg" class="pet">
                      <p>German Shepherd</p>
                  </label>
                </div>
                <div class="col-xs-4">
                  <label>
                      <input type="radio" name="selectedBreed" value="Labrador" />                
                      <img src="Labrador.jpg" class="pet">
                      <p>Labrador Retriever</p>  
                  </label>
                </div>
              </div>
            </div>
            <div class="link_2 col-xs-4 col-xs-offset-1" style="display:none">
                <div class="row">
                    <div class="col-xs-12">
                        <h1>Please Choose a Breed</h1>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-xs-4">
                      <label>
                          <input type="radio" name="selectedBreed" value="Persian" />
                          <img src="Persian.jpg" class="pet">
                          <p>Persian</p>
                      </label>
                    </div>
                    <div class="col-xs-4">
                      <label>
                          <input type="radio" name="selectedBreed" value="Siamese" />
                          <img src="Siamese.jpg" class="pet">
                          <p>Siamese</p>
                      </label>
                    </div>
                    <div class="col-xs-4">
                      <label>
                          <input type="radio" name="selectedBreed" value="Sphynx" />                
                          <img src="Sphynx.jpg" class="pet">
                          <p>Sphynx</p>  
                      </label>
                    </div>
                  </div>
            </div>
          </div>
          <!-- CHOOSE FOOD ROW -->
          <div class="row cont-breeds">
              <div class="link_1 col-xs-4 col-xs-offset-1 cont-breeds" style="display:none">
                <div class="row">
                  <div class="col-xs-12">
                      <h1>Add-ons: Dog Food</h1>
                  </div>
                </div>
                <div class="row">
                  <div class="col-xs-4">
                    <label>
                        <input type="radio" name="selectedFood" value="BlueBuffalo" />
                        <img src="Blue Buffalo.jpg" class="pet">
                        <p>Blue Buffalo</p>
                    </label>
                  </div>
                  <div class="col-xs-4">
                    <label>
                        <input type="radio" name="selectedFood" value="Canidae" />
                        <img src="Canidae.jpg" class="pet">
                        <p>Canidae</p>
                    </label>
                  </div>
                  <div class="col-xs-4">
                    <label>
                        <input type="radio" name="selectedFood" value="Pedigree" />                
                        <img src="Pedigree.jpg" class="pet">
                        <p>Pedigree</p>  
                    </label>
                  </div>
                </div>
              </div>
              <div class="link_2 col-xs-4 col-xs-offset-1" style="display:none">
                  <div class="row">
                      <div class="col-xs-12">
                          <h1>Add-ons: Cat Food</h1>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-xs-4">
                        <label>
                            <input type="radio" name="selectedFood" value="Authority" />
                            <img src="Authority.jpg" class="pet">
                            <p>Authority</p>
                        </label>
                      </div>
                      <div class="col-xs-4">
                        <label>
                            <input type="radio" name="selectedFood" value="FancyFeast" />
                            <img src="Fancy.jpg" class="pet">
                            <p>Fancy Feast</p>
                        </label>
                      </div>
                      <div class="col-xs-4">
                        <label>
                            <input type="radio" name="selectedFood" value="Friskies" />                
                            <img src="Friskies.jpg" class="pet">
                            <p>Friskies</p>  
                        </label>
                      </div>
                    </div>
              </div>
          </div>
          <!-- SHOW ORDER BUTTON -->
          <div class="row cont-breeds">
            <div class="link_1 col-xs-1 col-xs-offset-5" style="display:none; padding: 15px 0;">
                <input class="sbmt" type="submit" value="Show Order">
            </div>
            <div class="link_2 col-xs-1 col-xs-offset-5" style="display:none; padding: 15px 0;">
                <input class="sbmt" type="submit" value="Show Order">
            </div>
          </div>
          </form>
        </div>
        <script>
            $('.gold').on('click',function() {
                $("[class^=link]").not($("."+this.id)).slideUp(300);
                $("."+this.id).slideToggle(2000);
            });
        </script>
    </body>
</html>