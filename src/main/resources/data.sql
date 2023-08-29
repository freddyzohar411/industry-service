-- Insert parent industries
INSERT INTO industry (name, parent_industry_id) VALUES ('Information Technology', NULL); -- 1
INSERT INTO industry (name, parent_industry_id) VALUES ('Medical and Healthcare', NULL); -- 2
INSERT INTO industry (name, parent_industry_id) VALUES ('Financial Services', NULL);    -- 3
INSERT INTO industry (name, parent_industry_id) VALUES ('Manufacturing', NULL);        -- 4
INSERT INTO industry (name, parent_industry_id) VALUES ('E-commerce', NULL);          -- 5
INSERT INTO industry (name, parent_industry_id) VALUES ('Food and Beverage', NULL);  -- 6
INSERT INTO industry (name, parent_industry_id) VALUES ('Real Estate', NULL);      -- 7
INSERT INTO industry (name, parent_industry_id) VALUES ('Transportation', NULL); -- 8
INSERT INTO industry (name, parent_industry_id) VALUES ('Fashion and Apparel', NULL); -- 9
INSERT INTO industry (name, parent_industry_id) VALUES ('Media and Entertainment', NULL);   -- 10
-- Add more parent industries as needed

-- Children of 'Information Technology'
INSERT INTO industry (name, parent_industry_id) VALUES ('Software Development', 1);
INSERT INTO industry (name, parent_industry_id) VALUES ('Cybersecurity', 1);
INSERT INTO industry (name, parent_industry_id) VALUES ('Hardware', 1);

-- Children of 'Medical and Healthcare'
INSERT INTO industry (name, parent_industry_id) VALUES ('Pharmaceuticals', 2);
INSERT INTO industry (name, parent_industry_id) VALUES ('Medical Devices', 2);

-- Children of 'Financial Services'
INSERT INTO industry (name, parent_industry_id) VALUES ('Banking', 3);
INSERT INTO industry (name, parent_industry_id) VALUES ('Insurance', 3);

-- Children of 'Manufacturing'
INSERT INTO industry (name, parent_industry_id) VALUES ('Automotive', 4);
INSERT INTO industry (name, parent_industry_id) VALUES ('Textiles', 4);

-- Children of 'E-commerce'
INSERT INTO industry (name, parent_industry_id) VALUES ('Online Retail', 5);
INSERT INTO industry (name, parent_industry_id) VALUES ('Online Services', 5);

-- Children of 'Food and Beverage'
INSERT INTO industry (name, parent_industry_id) VALUES ('Restaurants', 6);
INSERT INTO industry (name, parent_industry_id) VALUES ('Packaged Goods', 6);

-- Children of 'Real Estate'
INSERT INTO industry (name, parent_industry_id) VALUES ('Residential', 7);
INSERT INTO industry (name, parent_industry_id) VALUES ('Commercial', 7);

-- Children of 'Transportation'
INSERT INTO industry (name, parent_industry_id) VALUES ('Airlines', 8);
INSERT INTO industry (name, parent_industry_id) VALUES ('Railways', 8);

-- Children of 'Fashion and Apparel'
INSERT INTO industry (name, parent_industry_id) VALUES ('Footwear', 9);
INSERT INTO industry (name, parent_industry_id) VALUES ('Accessories', 9);

-- Children of 'Media and Entertainment'
INSERT INTO industry (name, parent_industry_id) VALUES ('Movies', 10);
INSERT INTO industry (name, parent_industry_id) VALUES ('Music', 10);

-- Additional Children of 'Information Technology'
INSERT INTO industry (name, parent_industry_id) VALUES ('Cloud Computing', 1);
INSERT INTO industry (name, parent_industry_id) VALUES ('Data Analytics', 1);
INSERT INTO industry (name, parent_industry_id) VALUES ('IoT', 1);
INSERT INTO industry (name, parent_industry_id) VALUES ('AI & Machine Learning', 1);

-- Additional Children of 'Medical and Healthcare'
INSERT INTO industry (name, parent_industry_id) VALUES ('Telemedicine', 2);
INSERT INTO industry (name, parent_industry_id) VALUES ('Mental Health', 2);

-- Additional Children of 'Financial Services'
INSERT INTO industry (name, parent_industry_id) VALUES ('Investment Banking', 3);
INSERT INTO industry (name, parent_industry_id) VALUES ('Asset Management', 3);

-- Additional Children of 'Manufacturing'
INSERT INTO industry (name, parent_industry_id) VALUES ('Electronics', 4);
INSERT INTO industry (name, parent_industry_id) VALUES ('Machinery', 4);

-- Additional Children of 'E-commerce'
INSERT INTO industry (name, parent_industry_id) VALUES ('Marketplace', 5);
INSERT INTO industry (name, parent_industry_id) VALUES ('Digital Payments', 5);

-- Additional Children of 'Food and Beverage'
INSERT INTO industry (name, parent_industry_id) VALUES ('Beverage Production', 6);
INSERT INTO industry (name, parent_industry_id) VALUES ('Food Processing', 6);

-- Additional Children of 'Real Estate'
INSERT INTO industry (name, parent_industry_id) VALUES ('Property Management', 7);
INSERT INTO industry (name, parent_industry_id) VALUES ('Real Estate Development', 7);

-- Additional Children of 'Transportation'
INSERT INTO industry (name, parent_industry_id) VALUES ('Shipping', 8);
INSERT INTO industry (name, parent_industry_id) VALUES ('Logistics', 8);

-- Additional Children of 'Fashion and Apparel'
INSERT INTO industry (name, parent_industry_id) VALUES ('High Fashion', 9);
INSERT INTO industry (name, parent_industry_id) VALUES ('Sportswear', 9);

-- Additional Children of 'Media and Entertainment'
INSERT INTO industry (name, parent_industry_id) VALUES ('Publishing', 10);
INSERT INTO industry (name, parent_industry_id) VALUES ('Broadcasting', 10);

-- Additional Children of 'Information Technology'
INSERT INTO industry (name, parent_industry_id) VALUES ('Virtual Reality', 1);
INSERT INTO industry (name, parent_industry_id) VALUES ('Networking', 1);
INSERT INTO industry (name, parent_industry_id) VALUES ('Web Development', 1);
INSERT INTO industry (name, parent_industry_id) VALUES ('IT Consulting', 1);
INSERT INTO industry (name, parent_industry_id) VALUES ('Game Development', 1);

-- Additional Children of 'Medical and Healthcare'
INSERT INTO industry (name, parent_industry_id) VALUES ('Biotechnology', 2);
INSERT INTO industry (name, parent_industry_id) VALUES ('Dentistry', 2);
INSERT INTO industry (name, parent_industry_id) VALUES ('Nutrition & Wellness', 2);

-- Additional Children of 'Financial Services'
INSERT INTO industry (name, parent_industry_id) VALUES ('Fintech', 3);
INSERT INTO industry (name, parent_industry_id) VALUES ('Venture Capital', 3);
INSERT INTO industry (name, parent_industry_id) VALUES ('Cryptocurrency', 3);

-- Additional Children of 'Manufacturing'
INSERT INTO industry (name, parent_industry_id) VALUES ('Aerospace', 4);
INSERT INTO industry (name, parent_industry_id) VALUES ('Chemicals', 4);
INSERT INTO industry (name, parent_industry_id) VALUES ('Metals & Mining', 4);

-- Additional Children of 'E-commerce'
INSERT INTO industry (name, parent_industry_id) VALUES ('Subscription Services', 5);
INSERT INTO industry (name, parent_industry_id) VALUES ('Online Auctions', 5);

-- Additional Children of 'Food and Beverage'
INSERT INTO industry (name, parent_industry_id) VALUES ('Organic Foods', 6);
INSERT INTO industry (name, parent_industry_id) VALUES ('Catering', 6);
INSERT INTO industry (name, parent_industry_id) VALUES ('Seafood', 6);

-- Additional Children of 'Real Estate'
INSERT INTO industry (name, parent_industry_id) VALUES ('Hospitality', 7);
INSERT INTO industry (name, parent_industry_id) VALUES ('Vacation Rentals', 7);

-- Additional Children of 'Transportation'
INSERT INTO industry (name, parent_industry_id) VALUES ('Public Transport', 8);
INSERT INTO industry (name, parent_industry_id) VALUES ('Courier Services', 8);

-- Additional Children of 'Fashion and Apparel'
INSERT INTO industry (name, parent_industry_id) VALUES ('Children’s Clothing', 9);
INSERT INTO industry (name, parent_industry_id) VALUES ('Luxury Goods', 9);

-- Additional Children of 'Media and Entertainment'
INSERT INTO industry (name, parent_industry_id) VALUES ('Podcasting', 10);
INSERT INTO industry (name, parent_industry_id) VALUES ('Film Production', 10);
INSERT INTO industry (name, parent_industry_id) VALUES ('Event Management', 10);

