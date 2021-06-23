// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random poem to the page.
 */
function addRandomPoem() {
  const poems =
      ['"America" by Javon Johnson, Natasha Hooper, and Rudy Francisco', '"Sandlot" by Amen Ra and Rudy Francisco', '"Sons" by Terisa Siagatonu and Rudy Francisco', '"Dear White People" by FreeQuency','"See Something, Say Something" by Usama Minhas'];

  // Pick a random poem.
  const poem = poems[Math.floor(Math.random() * poems.length)];

  // Add it to the page.
  const poemContainer = document.getElementById('poem-container');
  poemContainer.innerText = poem;
}

async function showInterest() {
    const responseFromServer = await fetch('/interests');
    const textFromResponse = await responseFromServer.text();

    const interestContainer = document.getElementById('interest-container');
    interestContainer.innerText = textFromResponse;
}
